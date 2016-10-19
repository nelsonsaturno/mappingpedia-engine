package es.upm.fi.dia.oeg.mappingpedia.r2rml


object MappingPediaTest {
//	val VIRTUOSO_JDBC : String = "jdbc:virtuoso://localhost:1111/";
  	val VIRTUOSO_USER : String = "dba";
//  	val VIRTUOSO_PWD : String = "dba";
  	//val MANIFEST_FILE_PATH : String = "/home/fpriyatna/Dropbox/Documents/oeg/mappingpedia/SchemaPatterns/PR-NOR-CLTX-01/manifest.ttl";
  	//val MANIFEST_FILE_PATH : String = "C:/Users/Freddy/Dropbox/Documents/oeg/mappingpedia/SchemaPatterns/PR-NOR-CLTX-01/manifest.ttl";
  	val MANIFEST_FILE_PATH : String = "manifest.ttl";
	//val MAPPINGPEDIA_GRAPH : String = "MappingPedia";
	
	//val VIRTUOSO_JDBC : String = "jdbc:virtuoso://girtab.dia.fi.upm.es:1129";
	val VIRTUOSO_JDBC : String = "jdbc:virtuoso://mappingpedia.linkeddata.es:1129";
  	val VIRTUOSO_PWD : String = "geo8";
//	public static String JDBC_VIRTUOSO = "jdbc:virtuoso://localhost:1129";
	//public static String JDBC_VIRTUOSO = "jdbc:virtuoso://138.100.11.17:1129/mappingpedia";
//	public static String JDBC_VIRTUOSO = "jdbc:virtuoso://138.100.11.17:1129";
	
  	
	def main(args: Array[String]): Unit = {
	  
	  //val manifestFilePath = "manifest.ttl"
//	  val manifestFilePath = "C:/Users/Freddy/Downloads/ts1/D000-1table1column0rows/manifest.ttl"
//	  val manifestFilePath = "/home/fpriyatna/Dropbox/Documents/oeg/mappingpedia/SchemaPatterns/PR-NOR-TSTX-02/manifest.ttl"; 
//	  val manifestFilePath = "C:/Users/Freddy/Dropbox/Documents/oeg/mappingpedia/SchemaPatterns/PR-NOR-TSTX-02/manifest.ttl";


	  Runner.run(MANIFEST_FILE_PATH, VIRTUOSO_JDBC
	      , VIRTUOSO_USER, VIRTUOSO_PWD, "true");
	}
	  
	  
}