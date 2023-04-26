package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> stringList=new ArrayList<>();
        for (Map.Entry<String,Set<String>> entry:projects.entrySet() ){
          System.out.println(entry.getKey()+ "/" + entry.getValue());
          String project=entry.getKey();
          Set<String> developers=entry.getValue();
          if (developers.contains(developer)){
              stringList.add(project);
          }
      }
        if (!stringList.isEmpty()) {
            Collections.sort(stringList);
            Collections.swap(stringList,0,1);
        }
        return stringList;
    }
}
