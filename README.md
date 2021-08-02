1. To  download Elasicsearch, Logstash:\n
  https://www.elastic.co/downloads/elasticsearch
  https://www.elastic.co/downloads/logstash

2. To run Elasticsearch :
  Go to /bin folder and run elasticsearch.bat file (For Windows)

3. Check elasticsearch on browser at "http://localhost:9200" (9200 is default port for elasticsearch we can change this)

4. For adding data to elasticsearch from database we need to create a file(https://github.com/sameeryadav71/Elasticsearch/blob/main/logstash-test.customer.conf) in /bin folder of    logstash directory by adding proper driver class and elastisearch host.

5. To run the logstash go to /bin directory and execute "logstash -f 'fileName'" where filename is nothing but the file which we created in previous step.

6. To check the data in elasticsearch go to "http://localhost:9200/test/_search?pretty=true" where test is nothing but the index name which we have given in .conf file.
