This folder contains the following:

	Project: The folder containing scripts associated with the implementation of the system
	Measurement Result: A subset of the measurement results that have been preserved and were used to generate the
						Graphs in the paper - Some of the results were lost during the progression of the experiment


The Project Folder:
	API 		- 	Scripts and files associated with the API part of the architecture and the associated client application
	
	Application 	- 	The implemented alerting application and its client for receiving the messages. The rec_all is a helper
					script for consistently reading all available data from a TCP socket.
					
	Commons 	-	A set of common objects and scripts that are used by multiple of the others:
					- APITopics - Contains the used topics for communicating with the API inside the broker
					- Broker: Class to instantiate a simple broker that listens on the specified port
					- ColInfo: An class holding all possible settings that can be made for a column
					- EdgeColInfo: A class that only holds the settings an edge processor should know about
					- PreprocessingColInfo: a class that only holds the settings that a preprocessor should know about.
					- Timer: The default time function in windows is inaccurate. Using perf count allows for accurate measurements,
								but it calling it between different threads causes it to start from different reference points
								this object is made to get a consistent reference point for time measuring between multipe threads.
					- Triple: Class version of an RDF triple for readability inside the code and convenience of comparing triples
	
	edge:		-	Holds all scripts related to the edge processing
					- Edgeprocessor2 is the described multiprocessing variant, its development was dropped after assessing the performance is not better
										than just using a singe processor
					- Parsing is a script used by the edgeprocessor to convert the time annotations. Prov:GeneratedAtTime requires ISO standard format.
	
	other:		- 	Scripts previously used for testing, these may now be broken as the development has continued.
	
	Preprocessing:	-	The sensing and preprocessing layer, and the dataset

Measurement_Results:
	-Edge:
		-Frequency_test: The results of the scalabilty test with increasing frequencies
		-Processing_times: The results of measuring the processing time for each format
	
	-Preprocessing:
		-ThresholdXX: results of measurement for a varying treshold
		-WindowProcessingTimes: result of the measurement for varying window sizes