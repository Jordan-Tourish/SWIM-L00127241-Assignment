package ie.lyit.serialize;
public interface CustomerDAO {
	   void add();
	   
	   void list();
	   
	   void delete();
	   
	   void edit();
	   
	   void readRecordFromFile();
	   
	   void writeRecordsToFile();
}
