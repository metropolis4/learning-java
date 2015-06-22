public class moreLoops {
  public static void main(String[] args) {
    String[] cities = {
      "Ft. Collins", "Wellington", "Aurora", "Greeley",
      "Evans", "Northglen", "Sterling", "Thornton"
    };
    for(String city : cities) {
      if(city != cities[cities.length -1])
        if(city == cities[0])
          System.out.println("I've lived in " + city + ",");
        else
          System.out.println(city + ",");
      else
        System.out.println("And " + city + ".");
    }
  }
}
