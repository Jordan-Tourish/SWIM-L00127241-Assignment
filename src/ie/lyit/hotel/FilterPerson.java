package ie.lyit.hotel;

import java.util.*;

public interface FilterPerson {
   public List<Person> meetCriteria(List<Person> persons);
}