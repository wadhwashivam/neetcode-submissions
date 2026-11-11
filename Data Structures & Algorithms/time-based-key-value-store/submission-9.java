class TimeMap {
    private HashMap<String, ArrayList<Integer>> timestamps;
    private HashMap<String, ArrayList<String>> values; 
    public TimeMap() {
        timestamps = new HashMap<>();
        values = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        timestamps.computeIfAbsent(key, k -> new ArrayList<>()).add(timestamp);
        values.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
    }
    
    public String get(String key, int timestamp) {
        if(!(timestamps.containsKey(key))){
            return "";
        }
        ArrayList<Integer> timestampList = timestamps.get(key);
        ArrayList<String> valueList = values.get(key);

        String res = "";

        int l = 0;
        int r = timestampList.size() - 1;
        while(l<=r){
            int m = l + (r-l)/2;

            if(timestamp >= timestampList.get(m)){
                res = valueList.get(m);
                l = m+1;
            }else{
                r = m-1;
            }
        }
        return res;
    }
}
