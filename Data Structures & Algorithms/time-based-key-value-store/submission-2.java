class TimeMap {
    private HashMap<String, List<Integer>> timestamps;
    private HashMap<String, List<String>> values;

    public TimeMap() {
        timestamps = new HashMap<>();
        values = new HashMap<>();    
    }
    
    public void set(String key, String value, int timestamp) {
        timestamps.computeIfAbsent(key, k -> new ArrayList<>()).add(timestamp);
        values.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
    }
    
    public String get(String key, int timestamp) {

        if(!timestamps.containsKey(key)){
            return "";
        }

        List<Integer> timeList = timestamps.get(key);
        List<String> valueList = values.get(key);

        int l = 0;
        int r = timeList.size()-1;

        String res = "";

        while(l<=r){
            int m = l + (r-l)/2;

            if(timeList.get(m) <= timestamp){
                res = valueList.get(m);
                l = m+1;
            }else{
                r= m-1;
            }
        }
        return res;
    }
}
