class TimeMap {

    private Map<String, Map<Integer, String>> myMap;

    public TimeMap() {
        myMap = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {

        if(myMap.containsKey(key)){
            myMap.get(key).put(timestamp, value);
        }else{
            Map<Integer, String> myMap1 = new HashMap<>();
            myMap1.put(timestamp, value);
            myMap.put(key, myMap1);
        }
        
    }
    
    public String get(String key, int timestamp) {
        
        if(myMap.containsKey(key)){
            Map<Integer, String> map = myMap.get(key);

            for(int i = 0; i<= timestamp; i++){
                if(key.equals("foo") && timestamp == 3){
                    System.out.println(i);
                }
                if(map.containsKey(timestamp - i)){
                return map.get(timestamp - i);
            }
            }
            
        }
            return "";
        

    }
}


