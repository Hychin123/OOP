package TP7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public class Example2 {
  public static void main(String[] args) {
    var a = new ArrayList<String>(List.of("Bopha", "Sokha"));
    System.out.println(a.toString());

    var b = new Hashtable<String, String>();
    b.put("Un", "One");
    b.put("Deux", "two");
    b.put("trois", "three");

    System.out.println(b.get("Deux"));

    var e = new HashMap<String, String>() {
      {
        put("Four", "Quatre");
        put("Five", "cinq");
        put("Six", "Six");
      }
    };
    System.out.println(e.get("Five"));
  }
}
