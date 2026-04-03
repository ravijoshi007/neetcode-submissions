class TimeMap {

    Map<String, TreeMap<Integer, String>> timeMap;

    public TimeMap() {
        timeMap = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {

        timeMap.computeIfAbsent(key, k -> new TreeMap<>()).put(timestamp, value); 
        
        
    }
    
    public String get(String key, int timestamp) {
        
        Map innerMap = timeMap.get(key);
        if(innerMap == null){
            return "";
        }
        if(innerMap.containsKey(timestamp)){
            return (String)innerMap.get(timestamp);
        }else{
            while(timestamp > 0){
                Object value = innerMap.get(timestamp--);
                if(value != null){
                    return (String)value;
                }
            }
        }
        return "";
    }
    
}
