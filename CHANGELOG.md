#Release Notes - Streaming Platform

## Version 0.9.0

## Improvement
* [SPOI-437] - Create more granular RESTful API calls in Stram for various entities in an instance 
* [SPOI-446] - Compute aggregate values for application instance on server side
* [SPOI-465] - Increase unit test coverage to at least 50%
* [SPOI-683] - Document Active MQ operatos in library/io/ActiveMQ*
* [SPOI-1038] - Support more options in launch command
* [SPOI-1127] - Standardize "subscribe" commands for all models and collections
* [SPOI-1130] - Gateway to log requests and response (like access log in apache)
* [SPOI-1150] - Create new mrcolor instance on init of topN visualization
* [SPOI-1152] - CLI: add -v flag for debug logging
* [SPOI-1154] - Provide physical plan connections via the Daemon API
* [SPOI-1163] - Refactored pages and routing mechanism
* [SPOI-1187] - Allow 50% width for adjacent widgets
* [SPOI-1188] - Put widely used UI components in node_modules/datatorrent
* [SPOI-1224] - CLI Help enhancement
* [SPOI-1232] - Allow a way to assign a default value to an attribute while defining the attribute
* [SPOI-1295] - Make UI compatible with Backbone v1.1.0
* [SPOI-1333] - Show stream locality in Streams widget 

## New Feature
* [SPOI-66] - App wide "do not autorecord" parameter
* [SPOI-90] - Define and implement Apache server adapter node
* [SPOI-117] - Boolean operator node
* [SPOI-184] - Dashboard to have a page for one streaming application
* [SPOI-389] - Parent jira for "alerts" as a product
* [SPOI-444] - Provide a cascade merge unifier feature.
* [SPOI-711] - Ads Dimension Time Bucket Missing Key
* [SPOI-847] - Introduce Operator in Operator optimization (ThreadLocal)
* [SPOI-916] - Create upload jar file widget
* [SPOI-945] - Add ability to specify application properties, DAG, operator and port attributes in stram configuration file.
* [SPOI-1007] - Run tests with headless browser for CI
* [SPOI-1148] - Add CPU percentage to Operator List and Operator View
* [SPOI-1213] - Map Reduce Debugger - AngularJS - WebSocket Integration
* [SPOI-1227] - Map Reduce Debugger - JSHint 
* [SPOI-1248] - DAG Visualization - Physical View - Color Coding Containers
* [SPOI-1323] - Pre-Deployment hook for Operator
* [SPOI-1332] - Logical Plan Update According to new Daemon API
* [SPOI-1345] - Add Alert Page - Application Name
* [SPOI-1377] - Create central package for language items
* [SPOI-1398] - Update DAG View Tool to Daemon API 0.9
* [SPOI-1401] - Add AUTO_RECORD attribute on the operator level
* [SPOI-1402] - Add capability to look up past alerts by timestamp
* [SPOI-1235] - Add support for "DB lookup" functionality 

## Bug
* [SPOI-440] - Change throughput calculation to use endWindow time
* [SPOI-727] - Document demo for charts
* [SPOI-904] - Tupleviewer: jump to valid index greater than total - visible fails
* [SPOI-992] - Javascript operator scriptBinding not serializable
* [SPOI-1037] - Daemon is creating a lot of threads that are not doing anything.  Need to investigate and fix.
* [SPOI-1107] - Send the Recording information as part of appropriate OperatorStats or PortStats
* [SPOI-1164] - Mark non-partitionable operators on malhar
* [SPOI-1186] - CSS issue when a page is not using dash manager
* [SPOI-1189] - Misbehaving Mobile Locator Demo
* [SPOI-1195] - DAG Explorer POC
* [SPOI-1219] - Thread-Local streams should be marked as "inline"
* [SPOI-1220] - Create a certification test for adsdimension demo
* [SPOI-1221] - CLI should read configuration on app launch, not on start
* [SPOI-1249] - duplicate sinks in streams in physical plan returned by web service
* [SPOI-1283] - Fix mobile demo configuration in customer environment
* [SPOI-1290] - Support hadoop.socks.server setting for dtcli
* [SPOI-1298] - change product and package name and bump version 
* [SPOI-1299] - Documment current DT Phone Home data 
* [SPOI-1307] - Implement TupleRecorderCollection.deactivated method
* [SPOI-1308] - Document how to configure applications
* [SPOI-1318] - Logical DAG Display Issue in Firefox
* [SPOI-1324] - MobileDemo: NullPointerException in StramChild
* [SPOI-1327] - AtLeastOnceTest.testInlineOperatorsRecovery intermittent failure
* [SPOI-1328] - Container not released and no operators running in it
* [SPOI-1343] - Remove recordingNames from heartbeat
* [SPOI-1349] - support set-pager command in dtcli
* [SPOI-1351] - Need submit button and hour glass on machine data
* [SPOI-1368] - Recording never loads in tupleviewer
* [SPOI-1369] - Tests failing with new Daemon API changes
* [SPOI-1371] - Add Alert Page fails
* [SPOI-1374] - Drop twitter demo app from sandbox launch-demo jar
* [SPOI-1386] - If I click on a "finished" task, the left top nav bar says "widget" instead of "applications"
* [SPOI-1387] - If I click on a "finished" task, the left top nav bar says "widget" instead of "applications"
* [SPOI-1391] - CPU percentage for operators are 100x too large


## Task
* [SPOI-634] - Enable unit tests in CI
* [SPOI-716] - Compare original javascript with new script operators (Python, Bash)
* [SPOI-720] - Coding conventions for Malhar GitHub
* [SPOI-817] - Implement Log Input Operator
* [SPOI-818] - Implement Parser Operator
* [SPOI-824] - Document Daemon API
* [SPOI-852] - Add life time per app on main dashboard
* [SPOI-853] - Create Pie Chart widget based on D3.js
* [SPOI-854] - Create Bar Chart widget based on D3.js
* [SPOI-856] - Create Histogram (Real-Time Traffic) widget based on D3.js
* [SPOI-857] - Site Stats Back-End Front-End Integration
* [SPOI-861] - Redis Client with Node.js for Site Stats
* [SPOI-862] - REST API with Node.js for Site Stats
* [SPOI-907] - Create Application DAG visualization
* [SPOI-954] - Publish Platform REST API
* [SPOI-998] - Throughput computations should be controllable via attributes per application
* [SPOI-999] - Throughput computations should be controllable per operator
* [SPOI-1002] - List application names instead of class names where available
* [SPOI-1033] - Implement OiO validations
* [SPOI-1062] - Build out Google Cloud cluster
* [SPOI-1066] - Design Versioning Scheme for forward and backward compatiblity
* [SPOI-1086] - Dynamically scale up and down input Operators
* [SPOI-1131] - Create Training Sessions
* [SPOI-1133] - Create Training Session 2
* [SPOI-1134] - Create Training session 3
* [SPOI-1139] - Productize DAG visualization
* [SPOI-1142] - Build a fraud detection poc
* [SPOI-1143] - Implement new Daemon API
* [SPOI-1159] - Conform to new Daemon API for REST and WebSocket
* [SPOI-1160] - Move REST logic from DataSource to classes
* [SPOI-1165] - Create a certification test for performance demo
* [SPOI-1166] - Create a certification test for twitter demo
* [SPOI-1168] - Create a certification test for mobile demo
* [SPOI-1193] - replace web socket client in tuple recorder with async web socket client
* [SPOI-1194] - remove "sync" from hdfs part file collection and implement web socket update of the newest part file
* [SPOI-1197] - DAG View - Application Logical Plan as Standalone Java Application/Maven Plugin
* [SPOI-1198] - DAG View - DAG Visualization from JSON file
* [SPOI-1199] - DAG View - DAG Visualization from properties file
* [SPOI-1207] - Common Apps Template
* [SPOI-1210] - Map Reduce Debugger - AngularJS Directives
* [SPOI-1216] - Benchmark performance benchmark with stream locality
* [SPOI-1222] - CLI enhancements
* [SPOI-1223] - CLI enhancements
* [SPOI-1226] - Create list of platform attributes - port, operator, stream, application
* [SPOI-1239] - Names for deamon and cli
* [SPOI-1247] - Update UI for change in logicalPlan format
* [SPOI-1256] - Make Machine Data Demo scalable
* [SPOI-1262] - Parent JIRA for "face-lift demo apps for Hadoop World"
* [SPOI-1265] - Web Demos - Common Application
* [SPOI-1268] - Document all the attributes in Documentation (Guides)
* [SPOI-1276] - Customer demo build tools
* [SPOI-1277] - Add performance demo to customer apps
* [SPOI-1279] - In Stream List view show DataLocality
* [SPOI-1282] - Update benchmarks
* [SPOI-1285] - keys in instanceinfo widget to be shortened
* [SPOI-1286] - Add GB used to instanceOverview widget
* [SPOI-1287] - Rename operator names and stream names on AdsCustomerApplication
* [SPOI-1294] - Bump up the disk space in sandbox
* [SPOI-1309] - Update Operations and Installation Guide by adding a section on parameter setting
* [SPOI-1334] - Create data for Scalability White paper
* [SPOI-1335] - Create Scalability White paper
* [SPOI-1336] - Create First cut of logstream white paper
* [SPOI-1337] - Create first cut for Gateway white paper
* [SPOI-1339] - Productize LogStream white paper
* [SPOI-1340] - Write Scalalability and Design Pattern white paper
* [SPOI-1347] - Redis periodic cleanup node8
* [SPOI-1348] - Add elapsed time to demo throughput widget
* [SPOI-1352] - Need urls on Machine data demo to suppoer key combos
* [SPOI-1353] - Machine data demo UI should show which keys are not selected
* [SPOI-1356] - Make default look back on machine gen demo - 180 minutes
* [SPOI-1362] - Set up separate Redis instance and application for Machine demo
* [SPOI-1363] - gateway API recordings retrieval minor parameter name change
* [SPOI-1366] - Reduce scope of dependency versions in Front
* [SPOI-1367] - Name and ports not showing up in recording list
* [SPOI-1372] - On dashboard change "Operations" to "Applications" in the first tab
* [SPOI-1373] - Sandbox: size should be 8G by default, 4G causes most apps to not work
* [SPOI-1375] - All sandbox apps must work in 8G VM. Need to test each
* [SPOI-1381] - Add link to Malhar open source project in Sandbox
* [SPOI-1382] - Add MachineCustomerApplication to launch-customer jar on node1
* [SPOI-1399] - Add two new docs to the 0.9 release, to the website
* [SPOI-1400] - Add timestamp for each tuple in tuple recordings

## Sub-task
* [SPOI-1109] - Change the frontend code to so that the recording information is received as part of the stats
* [SPOI-1135] - Beautify "Twitter Top URLs" demo
* [SPOI-1156] - mocha-phantomjs fails on test
* [SPOI-1228] - Benchmark Performance with stream locality as thread-local
* [SPOI-1229] - Benchmark Performance with stream locality as process local
* [SPOI-1230] - Benchmark Performance with stream locality as node-local
* [SPOI-1231] - Benchmark Performance with stream locality as rack-local
* [SPOI-1240] - Create Hadoop 2.2 cluster on GC
* [SPOI-1241] - Migrate morado cluster to Hadoop 2.1
* [SPOI-1263] - Beautify "Mobile" demo app
* [SPOI-1264] - Beautify "Machine Generated" demo app
* [SPOI-1272] - Investigate Google Cluster Disks, Networking, Firewalls
* [SPOI-1273] - Install Chef Server for central provisioning
* [SPOI-1274] - Twitter demo - small changes in backend
* [SPOI-1275] - Mobile demo - small changes in backend
* [SPOI-1278] - Configure and install node0
* [SPOI-1304] - Migrate core to Hadoop 2.2
* [SPOI-1322] - Configure and install datanode
* [SPOI-1379] - Configuration changes to support Hadoop 2.2
* [SPOI-1380] - Fix customer demos creation for Hadoop 2.2
* [SPOI-1394] - Enable testing during build for Malhar
* [SPOI-1395] - Enable build testing for front
* [SPOI-1396] - Enable build testing from Core

## GitHub - DataTorrent/Malhar
* [288] - Machine Demo Circular Keys. Squashed commit of the following:
* [286] - Ads Dimensions Demo - REST API
* [285] - Machine Data Demo - No Data Behavior 
* [281] - Machine Data Demo - Circular Keys Retrieval Unit Test
* [280] - Machine Data Demo - Retrieving Circular Keys from Redis
* [276] - Make topic and brokerList configurable properties for kafka input operator
* [275] - fixed github issue #273
* [274] - Couch operators 0.9
* [267] - [logstream] add logstream usecases
* [263] - Backend support to add a range of mobile numbers 
* [261] - Github issues #260 and #240
* [259] - Make benchmarks appear more friendly in application list
* [258] - Ads Dimensions Demo. Squashed commit of the following:
* [257] - Machine and Ads Demos Common Styling
* [256] - SPOI-1408 added AsyncHttpClient.close() calls
* [255] - Github 240
* [254] - Ads Dimensions Demo - Redis Unit Test
* [253] - Port Ads Dimensions Demo to AngularJS
* [249] - Added support to mobile app for adding range of numbers at a time #242
* [248] - Remove reload button from MachineData demo
* [247] - Web Apps Upgrade to Daemon API 0.9. Machine Demo optimizations. Squashed commit of the following:
* [246] - Documentation had a typo which was repeated. I fixed it and also reorganized imports.
* [243] - Web Apps - Upgrade to Daemon API 0.9
* [241] - Add ads demo to common demo UI
* [240] - Make the keys in Machine Data circular
* [239] - Machine Demo - Negative Values in Random Data
* [238] - Machine Demo - Load Indicator on Slow Response
* [237] - Machine Demo - Instant Reload on Dimensions Change
* [236] - Machine Demo - Line Chart Options for Empty Chart
* [235] - Machine Demo - Server Polling Statistics
* [231] - fixed github issue #220
* [230] - Machine Demo - Error Handling
* [228] - Machine Demo - Redis Query Optimization
* [227] - Machine Demo - Client Cache for Chart Data
* [226] - fixed github issue 219
* [225] - 0.9 migration
* [224] - Show hourglass on the machine data demo in case of network (internet) being slow
* [223] - Setting Expiry Date for Redis Keys in RedisOutputOperator
* [222] - Couch Input Output Adaptors
* [221] - Web Apps - AngularJS Directive for Google Line Chart
* [220] - Making Redis Operator partionable
* [219] - Setting Expiry Date for Redis Keys in RedisOutputOperator
* [218] - made output port of alert escalation autorecord
* [217] - Add credit card fraud detection demo
* [216] - Squashed commit of the following:
* [215] - Machine demo should have 180 minutes as default in UI
* [211] - Fraud App Rename
* [210] - Web Apps - Fraud 
* [209] - 0.9 pull
* [208] - Web Apps - Elapsed Time
* [207] - 0.9 migration
* [206] - SimpleMovingAverage is resetting the second last window state
* [205] - Fix PythonOperator
* [204] - Fix BashOperator
* [203] - Marking operators non-partitionable
* [202] - added new output port in JsonByteArrayOperator for emiting flattened map
* [201] - #198 Machine Data Demo - Dynamic Dimensions. Squashed commit of the following:
* [200] - added new output port in JsonByteArrayOperator for emiting flattened map
* [199] - making the attributes configurable from stram-site
* [198] - Machine Data Demo - Dynamic Dimensions
* [197] - Web Apps Machine Demo Update/Multiple FIxes
* [196] - Mobile Demo corrections
* [195] - Web Apps Machine Demo Update/Multiple Fixes
* [194] - Web Apps - Machine Data Demo - Last Minute Calculations
* [193] - reduced the I/O worker thread multiplier to 1 as default in ning AHC
* [192] - Web Apps - Express Version
* [191] - Web Apps - Browser Dependencies
* [190] - 0.9 migration
* [188] - Web Apps (Demos) - Squashed commit of the following:
* [186] - Web Apps - Styling
* [185] - Web Apps - Readme
* [184] - made the machine data and ads demo scalable
* [183] - Web Apps - JSHint
* [182] - Fixed seeds phone generator and other bugs with MobileDemo #172
* [180] - suppress warning for stdout in console output operator
* [178] - Web Apps - License Headers
* [177] - Twitter demo application is called TwitterDevApplication
* [176] - Removed phone.html that is not being used. Fixes #175.
* [175] - Remove phone html that is not being used
* [174] - Resolving mobile demo bug
* [173] - bug in phonemovement
* [169] - Code format changes to KryoSerializableStreamCodec
* [168] - Web Apps - Demos Descriptions
* [167] - javascript operator now serializable
* [165] - Squashed commit of the following:
* [164] - Operator and stream names of adsdimension application can be clearer
* [163] - Web Apps - Mobile Locator Demo - Google Maps Marker Labels
* [162] - Web Apps - Machine Data Demo - CPU/RAM/HDD Gauges
* [161] - Web Apps - Machine Data Demo - Device ID Dimension
* [158] - Made Mobile enhancements #157
* [157] - Mobile Demo: Minor enhancements 
* [156] - Web Apps - Index Page
* [155] - Web Apps - Machine Data Demo
* [154] - Web Apps - Mobile Locator Demo
* [151] - change name and jump version
* [150] - Twitter multiplier variance #148
* [149] - Checkpoint consumer offset  #146
* [148] - Twitter demo: change tweet multipler from 100 to Random(90-110)
* [146] - Commit offset at checkpoint for kafka input operator
* [145] - Web Apps POC
* [144] - MachineData: bug in MachineInfoAveragingOperator
* [143] - migrated to ning for web socket interface provider
* [142] - 0.4 migration
* [141] - upgraded framework version to 0.3.5
* [140] - method rename in RedisOutputOperator #138
* [139] - Add partitionable kafka input operator #113
* [138] - Change selectDatabase in RedisOutputOperator to setDatabase
* [137] - Couch DB Output adapter added #130
* [136] - Reducing tuple blast size #135
* [135] - MachineData: reduce the number of tuples generated by the random generator
* [134] - Mapreduce Pull Request
* [133] - [logstream] logstream app flow
* [132] - Bug in UniqueKeyValCounter 
* [131] - Deleted old unique value count operator #129
* [129] - Delete the old UniqueValueKeyVal operator and rename the new UniqueValueCount 
* [128] - Corrections to UniqueValueCount #127
* [127] - UniqueValueCount improvements
* [126] - Changed deprecated call to setInline to setLocality.
* [125] - Changed setInline call to setLocality
* [123] - Clean up unused libraries
* [122] - squashed changed to UniqueCount #112
* [121] - Operator that counts unique value per key #112
* [120] - add all the locality modes to performance test
* [119] - Squashed changes and fixed version #99
* [118] - MachineData integrated operators #99
* [117] - Adding Redis input operators #43
* [116] - Logstream merge 43
* [115] - Adding Redis input operators
* [114] - Implement the automate partitioned kafka input operator(1:1) #113
* [113] - Add partitionable kafka input operator (1:1)
* [103] - move the test residue to maven target directory so that mvn clean can clean all the files
* [102] - Sqaushed changes for KryoSerializableStreamCodec & Test #95
* [101] - Pull request for #95
* [100] - Pull request for  issue #95
* [99] - Add more statistics calculations to machine data
* [98] - Issue 95
* [97] - Add machinedata demo
* [96] - Added output port to json byte array operator to emit JSONObjects too
* [95] - Create an Abstract SteamCodec which can be used for custom partitioning and uses kryo serialization
* [94] - added two output ports - outputMap, outputJSonObject
* [93] - Upgrade Kafka to 0.8
* [88] - starmcli not taking the jar passed during launching application
* [73] - Upgrade our kafka operator api to be compatible with mvn released Kafka version 0.8
* [70] - Clean kafka package in malhar library #53
* [52] - addCombination doesn't work in DimensionTimeBucketOperator
* [46] - SiteOps Dashboard Look and Feel
* [45] - Move SiteOps Demo to Node.js
* [44] - Sliding window aggregation computations operators
* [43] - Create Redis Input Operator
* [42] - Please pull my latest changes
* [41] - Web Demos - License Headers
* [40] - Move Ads Dimensions Demo to Node.js
* [39] - AlertEscalationOperatorTest test failing
* [38] - Move Mobile Demo to Node.js
* [37] - Move Twitter Demo to Node.js
* [36] - Move Twitter, Mobile and Ads Demo to Node.js - fixes #34
* [35] - Create AMQP Input Operator
* [34] - Move Twitter, Mobile and Ads Dimensions Demo to Node.js
* [33] - Ads Dimensions Demo - Common Template
* [32] - Common Assets for the Demos
* [31] - Migrate deprecated setInline calls. fixes #16
* [30] - bump master version to 0.3.5-SNAPSHOT
* [29] - Javascript operator scriptBinding not serializable
* [28] - Node.js Ads Dimensions Demo - "Play" mode
* [27] - Node.js Ads Dimensions Demo - Node.js Daemon
* [26] - Node.js Ads Dimensions Demo - Dynamic Port
* [25] - Node.js Ads Dimensions Demo - Readme
* [24] - Node.js Ads Dimensions Demo Rename
* [23] - Mrapplication
* [21] - keyvalpair doing hash on key and value
* [18] - 404 error in the UI for logicalPlan
* [17] - Emitted tuples by InputOperator incorrectly shown as zero
* [16] - Adapt new stream locality API 
* [11] - Create an alerts demo for testing alerts
* [4] - Make alert throttle operator window id based instead of wall clock time.


## Version 0.3.5

## Bug
* [SPOI-349] - InlineStream undeploy error
* [SPOI-766] - Process for certification of 0.3.3 launch on demo server
* [SPOI-953] - Implement Exactly Once
* [SPOI-959] - Operator Properties Widget
* [SPOI-976] - Mobile apps keep dying
* [SPOI-1013] - Cluster clocks are not in sync
* [SPOI-1017] - Daemon stopped publishing over WebSocket
* [SPOI-1022] - Alert is removed from the list on server failure
* [SPOI-1023] - "Method Not Allowed" error when deleting an alert
* [SPOI-1030] - DT Phone Home throw NullPointerException
* [SPOI-1034] - 404 Not Found when getting alerts
* [SPOI-1035] - Cannot create alerts with stramcli
* [SPOI-1041] - Operator Properties fail to load
* [SPOI-1051] - URLs templating for REST API
* [SPOI-1075] - Container planned/alloc does not update in real time
* [SPOI-1076] - Buffer server read is a flat line
* [SPOI-1081] - Get common urls for all demos
* [SPOI-1087] - Fix container chart
* [SPOI-1089] - Widgets initializing twice
* [SPOI-1090] - Add d3 to package.json deps
* [SPOI-1091] - dashboard manager css issue with background color
* [SPOI-1092] - Widget list not rendering on initial page load
* [SPOI-1093] - Memory leak when switching between pages
* [SPOI-1097] - dashboards not being saved
* [SPOI-1101] - Explore Kibana 3 as UI option for site stats
* [SPOI-1103] - Kill button doesn't work on applist palette
* [SPOI-1104] - Mode switch separator in header still visible
* [SPOI-1105] - shutdown application command requires empty data object
* [SPOI-1114] - Test for  AlertManagerTest.testAlertManager failed
* [SPOI-1118] - Upgrade grid to 4GB containers
* [SPOI-1121] - URL for deleting alert is incorrect
* [SPOI-1123] - Add alert action not sending all parameters
* [SPOI-1126] - Latency is whacked after adding alerts
* [SPOI-1137] - DAG Page View - JavaScript Error
* [SPOI-1144] - stram-site properties not applied to the operators (possibly?)
* [SPOI-1145] - ConcurrentModificationException when used launch local in stramcli
* [SPOI-1147] - Cannot kill "running" or relaunch "killed" application instance from AppLIst widget
* [SPOI-1157] - NoSuchElementException in stramcli

## Epic
* [SPOI-870] - Alerts parent jira for phase I

## Improvement
* [SPOI-462] - Feature to specify that an operator cannot be partitioned.
* [SPOI-523] - Document OS style guidelines
* [SPOI-750] - Performance Metrics Widget Unit Test
* [SPOI-937] - Incorporate jQuery UI into current dashboard
* [SPOI-962] - Daemon REST API Conventions
* [SPOI-963] - For exactly-once pick the correct checkpoint for recovery 
* [SPOI-979] - Need old versions of javadoc available online
* [SPOI-983] - Front-End Release Branch
* [SPOI-1019] - switch to jquery ui tooltip
* [SPOI-1028] - Correctly order output port list for operator AlertThreeLevelTimedEscalationOperator
* [SPOI-1078] - Add appInfo to apps.list WebSocket topic
* [SPOI-1094] - Subscribe to app-specific websocket topic while on application
* [SPOI-1102] - Alerts should be a list of js object literals
* [SPOI-1106] - tables should resize as widget resizes by default
* [SPOI-1119] - Remove Malhar subtree dependency from Core
* [SPOI-1125] - Utilize new "optional" attribute with alert template parameters

## New Feature
* [SPOI-641] - Setting partition on operator not supporting partitioning must result in error.
* [SPOI-810] - Create a line charting module using d3.js
* [SPOI-831] - Create REST API call for uploading JAR files
* [SPOI-832] - Create REST API call to retrieve all uploaded jar files
* [SPOI-834] - Create "Top N" widget
* [SPOI-874] - Provide description information for filter/throttle/action classes to be used by UI
* [SPOI-940] - Alert List Widget - Actions (Add/View/Delete)
* [SPOI-987] - Add stramcli tab completion for alias and macro
* [SPOI-989] - Operator Properties Widget - Data Access Logic
* [SPOI-1011] - AlertModel - Delete
* [SPOI-1012] - Mock Node.js Server - Alert Delete
* [SPOI-1014] - AlertCollection - Retrieve
* [SPOI-1016] - AlertModel - Create
* [SPOI-1018] - GitHub issue exporter for changelog
* [SPOI-1024] - AlertModel - Unit Test
* [SPOI-1025] - AlertCollection - Unit Test
* [SPOI-1026] - OpPropertiesModel - Unit Test
* [SPOI-1029] - Unit Testing - FakeXMLHttpRequest
* [SPOI-1040] - Node.js back-end for Ads Dimensions Demo
* [SPOI-1046] - Templatized Alert Creation Page
* [SPOI-1055] - Node.js Redis Client (Ads Dimensions Demo)
* [SPOI-1080] - Node.js Daemon
* [SPOI-1085] - Unified Demos Page
* [SPOI-1095] - Move Twitter Demo to Node.js
* [SPOI-1096] - Move Mobile Demo to Node.js
* [SPOI-1111] - Get common urls for all demos - POC
* [SPOI-1112] - Shutdown command from UI
* [SPOI-1116] - Move Machine Gen Demo to Node.js


## Task
* [SPOI-843] - Evaluate current market features
* [SPOI-846] - Implement exactly once
* [SPOI-855] - Dynamic re-partitioning happens on a snapshot, need to do a moving average by default
* [SPOI-895] - Implement REST API filterClasses for Alerts
* [SPOI-896] - Implement REST API escalationClasses for Alerts
* [SPOI-932] - CLI: support alert operations
* [SPOI-941] - Include latency in operator list in the dashboard.
* [SPOI-955] - Demo showing recurring payment check
* [SPOI-956] - Demo application for Machine (appliance) generated data monitoring resource usage (resources like CPU, RAM, etc)
* [SPOI-972] - Adapt core versioning scheme
* [SPOI-973] - Setup node.js as a supported technology
* [SPOI-982] - Version Eclipse settings
* [SPOI-986] - Version Nebeans settings
* [SPOI-995] - Unit test for AlertsManager
* [SPOI-996] - Unit test for AlertEscalation Operator
* [SPOI-1001] - Create a convenience script to start and stop hadoop cluster
* [SPOI-1008] - Cluster configuration versioning
* [SPOI-1009] - Need a signup link to Google group on Malhar first page
* [SPOI-1010] - Notificaitons on Malhar to include Google group
* [SPOI-1015] - Evaluate anomaly algorithms
* [SPOI-1021] - Set up user communication process
* [SPOI-1031] - Hide operations/development mode switch in UI
* [SPOI-1039] - Grid access
* [SPOI-1052] - Update node1 with latest release (0.3.4)
* [SPOI-1053] - Add users to grid
* [SPOI-1056] - Add create alert template REST call
* [SPOI-1057] - Change create alert REST call to use a template and parameters
* [SPOI-1058] - Retrieve alert REST call should include template name and parameters
* [SPOI-1060] - Get rid of stramRoot from the REST API (back end)
* [SPOI-1061] - Get rid of stramRoot from the REST API call (front end)
* [SPOI-1064] - Make machine generated data demo generic and launch on node1
* [SPOI-1070] - Dashboard look and feel for demos
* [SPOI-1071] - Dashboard look and feel for twitter firehose demo
* [SPOI-1072] - Dashboard look and feel for mobile demo
* [SPOI-1073] - Dashboard look and feel for ads dimensional demo
* [SPOI-1074] - Dashboard look and feel for machine gen demo
* [SPOI-1077] - Dashboard look and feel for logs demo
* [SPOI-1079] - Evaluate Integration with third party tools
* [SPOI-1100] - Update https://github.com/DataTorrent/Malhar
* [SPOI-1117] - Allow exactly-once with downstream at-most-once only
* [SPOI-1132] - Create Training session 1
* [SPOI-1151] - AngularJS Integration

## Sub-task
* [SPOI-876] - Allow for saving alert configurations as templates for future use, back-end
* [SPOI-877] - Allow for saving alert configurations as templates for future use, front-end
* [SPOI-978] - Fix dependency among open source and platform
* [SPOI-1042] - create alert template model
* [SPOI-1047] - create new page for add alert and re-route current url
* [SPOI-1048] - create parameter fill-in fields
* [SPOI-1113] - Remove child module poc build from framework build
* [SPOI-1176] - Remove malhar subtree from Core

## GitHub - DataTorrent/Malhar
* [90] - Fixed generics usage and renamed operator classes as per convention
* [89] - Added operator to convert json byte stream to java hash map
* [87] - Added operator to convert json byte stream to java hash map
* [86] - Web Demos Update
* [85] - Web Demos - Architecture Documentation
* [84] - Adding TravisCI build status to README #83
* [83] - Add TravisCI Build status to README
* [82] - Add TravisCI Integration
* [81] - [Logstream] Reads apache logs from RabbitMQ and prints basic aggregations to console
* [80] - Webdemos - round time to minute
* [79] - Adding apps project and logstream application skeleton.  #62
* [78] - SiteOps Demo - Totals Calculation
* [77] - Operator changes for issue #76
* [76] - Remove hardcoded values from RabbitMQ input operator
* [75] - [Issue 52]: addCombination doesn't work in DimensionTimeBucketOperator
* [74] - AMQP input operator for logs with sample aggregations #35
* [71] - Move Machine Generated Data Demo to Node.js
* [70] - Clean kafka package in malhar library #53
* [69] - Pull request for issue #53
* [68] - Web Demos Update
* [67] - SiteOps Demo - Redis Service
* [66] - Web Demos - Describe Configuration in Readme
* [65] - Ads Dimensions Demo - Redis Configuration
* [64] - Web Demos - Relative URLs for JS/CSS
* [63] - Adding apps project and logstream application skeleton.  #62
* [62] - Create skeleton application for log stream processing
* [60] - Move SiteOps Demo to Node.js - Unit Tests
* [59] - Move SiteOps Demo to Node.js - License Headers
* [58] - Move SiteOps Demo to Node.js - Charts
* [56] - Clean input operators in malhar-library
* [55] - Github 54
* [54] - PubSubWebSocket operators tests should be self contained and not need other helpers.
* [53] - Clean up Kafka input/output operator
* [51] - Ads webdemo is showing a drop in the graphs at the end
* [50] - Link to webdemos in main readme
* [49] - Clean input operators in lib
* [47] - Ads Dimensions Demo - JavaScript Loading Issue
* [22] - Node.js Ads Dimensions Demo
* [15] - Cleanup malhar-library input operator packages


## Version 0.3.4

## Bug
* [SPOI-569] - Ads demo charting is not stable; Needs cleanup
* [SPOI-570] - Mobile demo does not run forever
* [SPOI-599] - Sometimes in the metrics charts widget some charts are flat
* [SPOI-617] - Change error code from 500 to 400 for bad request
* [SPOI-630] - Stop recording action does not work
* [SPOI-660] - Recording shows a red light, but no recording is being done
* [SPOI-674] - AppModel and AppInstanceView need clean-up
* [SPOI-704] - Red dots show up in the dashboard, as if the operator is recording
* [SPOI-714] - Ads UI load is alow
* [SPOI-715] - Ads demo chart is 25 mins behind
* [SPOI-724] - Fix LocalFileInputOperator logic and documentation
* [SPOI-730] - Developer version for Mac OS X
* [SPOI-731] - Cannot record anymore. Tuple recorder is broken
* [SPOI-732] - Cannot stop recording
* [SPOI-742] - Installation/Compilation fails with maven-eclipse plugin
* [SPOI-744] - Facilitate the "accepted" app state for the app instance view
* [SPOI-747] - StreamingContainerManager.getContainerAgents() returns inactive containers
* [SPOI-748] - Build Kestrel as 3rd party library and depend on it instead of including the code with operator library
* [SPOI-751] - browser CPU utilization excessive with larger number of updates
* [SPOI-755] - Evaluate ads dimensional data demo
* [SPOI-756] - Account for single-item, non-list responses from web services
* [SPOI-757] - docs directory re-link for new version install
* [SPOI-762] - Application Model not updating correctly, causing graph issues
* [SPOI-764] - Malhar engine build is including StramAppMaster in engine jar in some cases
* [SPOI-765] - Datasource constructing tuple GET URL incorrectly for tupleviewer
* [SPOI-768] - Log file rotation support issue
* [SPOI-804] - If a node is bad the app master should choose a different node for the containers.
* [SPOI-806] - list-apps shows duplicate entries
* [SPOI-807] - downgrade jvm on node3
* [SPOI-809] - Add pig distinct semantic operator to library.
* [SPOI-811] - shutdown app does not work when not connecting to an app
* [SPOI-842] - Generated javadocs are missing several packages
* [SPOI-845] - Installer test fails when executing from different directory
* [SPOI-849] - Start recording from port list
* [SPOI-863] - Display application-wide latency in Application View
* [SPOI-883] - StramDelegationTokenManager should not be started if security is not enabled
* [SPOI-888] - Account for delay in Stram initialization in recently launched apps
* [SPOI-890] - Stram unit test is creating events data in stram/stram
* [SPOI-892] - getAppInfo throws an exception during the beginning of the application
* [SPOI-902] - Tupleviewer filter by port fails
* [SPOI-903] - Tupleviewer preview of loaded tuples not rendering
* [SPOI-905] - Review/fix license headers in open source
* [SPOI-911] - Sync recording call fails with 500 error
* [SPOI-915] - Log collection tool for hadoop cluster
* [SPOI-918] - Partitioning stopped on MobileLocatorDemo instance 48
* [SPOI-933] - Specify application names in stram configuration file for the customer demos on the cluster.
* [SPOI-946] - Certify Sandbox for Ubuntu
* [SPOI-951] - Auto completed file name does not work with launch command
* [SPOI-952] - Remove operator returns error about input stream still connected.
* [SPOI-958] - LocalFsInputOperator test is failing
* [SPOI-965] - UI: Make sure empty lists and single-item lists in JSON returned from Daemon is handled properly
* [SPOI-969] - UI: Stop recording fails with error saying some recording name was not found with operator undefined.
* [SPOI-971] - Aggregation function for application stats fails intermittently 
* [SPOI-974] - PageLoaderView Unit Test
* [SPOI-981] - Ensure "ports" are in the operators of the logicalPlan response
* [SPOI-991] - Daemon: windowIds must be sent as strings
* [SPOI-997] - Compute throughput as rolling average


## Improvement
* [SPOI-434] - Ability to subscribe to buffer server stream at next begin window
* [SPOI-450] - CLI: Allow wildcard in launch file name
* [SPOI-463] - The appMetrics widget should remember the choices on the graphs (on/off)
* [SPOI-470] - Provide allocated/planned container count
* [SPOI-614] - Better Error Handling/Error Pages
* [SPOI-620] - Allow recording from operator/port page
* [SPOI-624] - Normalize appid/appId opid/operatorId and similar discrepancies
* [SPOI-677] - Setup both Core and Front-End to run on local environment
* [SPOI-685] - Explore other charting libraries to replace custom chart module
* [SPOI-687] - Improve CSS for tupleviewer
* [SPOI-696] - Only update whole application collection on applist page
* [SPOI-712] - Explicit Errors when daemon provides data in unexpected format
* [SPOI-753] - Overview metrics for Port View should have comma separations
* [SPOI-835] - CLI needs to be able to handle spaces and escape characters
* [SPOI-844] - operatorClass REST call should also accept "chart" or "filter" for charting and alert filters
* [SPOI-901] - Add palette for containers list
* [SPOI-938] - Centralize reused templates for links

## New Feature
* [SPOI-70] - Parent JIra: Webservices for Streaming Application
* [SPOI-73] - Job completed report
* [SPOI-74] - Reporting: Job completion report should have the list of persisted files per node
* [SPOI-75] - Parameter to specify if persisted file names should be included in the job completion report
* [SPOI-127] - CLI: Throughput data (streams)
* [SPOI-129] - CLI: Streaming Ap Master data
* [SPOI-134] - Webservice: Stream data/throughput per stream in the application
* [SPOI-138] - Webservices: Data on committed windows
* [SPOI-139] - Webservice: Latency across the dag/application
* [SPOI-140] - Event Logging
* [SPOI-143] - Webservice: Bottleneck analysis
* [SPOI-219] - Evaluate if we need a naming scheme to identify a physical node of a logical dnode
* [SPOI-337] - Do an in-node stream by user choice
* [SPOI-403] - Design license file format
* [SPOI-417] - Licensing Specification
* [SPOI-460] - Create Preconfigured Sandbox
* [SPOI-471] - Stream View
* [SPOI-551] - Create Video for Recording Tuples
* [SPOI-628] - Web service for event logging
* [SPOI-698] - Add streamquery operators that support expression
* [SPOI-699] - Add pass through streamquery operators
* [SPOI-710] - DatatTorrent Wiki
* [SPOI-718] - Implement at most once for Operators with two or more connected input ports.
* [SPOI-719] - Implement Dag Validations for At-Most-Once
* [SPOI-738] - DT Phone Home Phase II
* [SPOI-829] - Calculate overall latency for application
* [SPOI-830] - Deduce critical path in DAG for application
* [SPOI-833] - operator's latency should be shown in the  UI
* [SPOI-891] - Create a web service API for describing operator class
* [SPOI-906] - Add palette for ports list
* [SPOI-908] - Selecting recordings from recording list fails
* [SPOI-909] - CSS issues with tupleviewer when port name too long
* [SPOI-920] - Application DAG UI Integration
* [SPOI-921] - Sandbox icons
* [SPOI-934] - Alert List Widget - Date/Time
* [SPOI-936] - Alert List Widget - Dynamic Width
* [SPOI-949] - Documentation processor from markdown to html


## Task
* [SPOI-60] - Streaming app master logging
* [SPOI-191] - Enable compression for end of window data or for throttled N tuples (N sent together)
* [SPOI-198] - Evaluate if buffer server should retain data in a compressed state
* [SPOI-199] - Evaluate if we need buffer server to keep data in compressed state
* [SPOI-425] - Checkpointing for exactly once operator recovery
* [SPOI-514] - Open Source Transition for Library/Contrib/Demos
* [SPOI-603] - Evaluation version for Mac OS X
* [SPOI-631] - Make a site operations video
* [SPOI-633] - Need changelog for new version
* [SPOI-656] - Performance metrics charts does not remember preferences
* [SPOI-681] - Added library description to index.html
* [SPOI-682] - Display Application DAG in UI (evaluation)
* [SPOI-706] - Allow app name to be specified in launch time config file
* [SPOI-708] - Set up demo procedures
* [SPOI-713] - Technical evaluation of UIs
* [SPOI-717] - Create launch macros on demo server
* [SPOI-734] - Push 0.3.3 to demo server
* [SPOI-735] - Launch the latest software on customer app server
* [SPOI-736] - Certify customer application server
* [SPOI-737] - Clean up redis history on customer apps
* [SPOI-740] - Updated documentation generation process
* [SPOI-745] - DT Phone Home Server side work
* [SPOI-754] - Create other user for node0 launches
* [SPOI-759] - Technical Evaluation
* [SPOI-760] - Format comments for ASF project for Malhar GitHub
* [SPOI-761] - Format comments in API
* [SPOI-769] - Fix sql DeleteOperator to make it pass thru.
* [SPOI-770] - Fix SelectOperator to make it pass thru.
* [SPOI-771] - Fix sql UpdateOperator code to make it pass thru.
* [SPOI-773] - Add seolect expression index.
* [SPOI-774] - Fix sql InnnerJoin operator join condition.
* [SPOI-775] - Fix sql Outer Join operator to merge left/right/full join sql semantic.
* [SPOI-776] - Add sql Having  semantic operator to library.
* [SPOI-777] - Add sql select top operator semantic to library.
* [SPOI-778] - Add sql select between condition sematic to library.
* [SPOI-779] - Add  sql select  compound condition  AND/OR semanticf to library. 
* [SPOI-780] - Add sql in condition semantic to library
* [SPOI-781] - Add sql like condition semantic to library.
* [SPOI-782] - Add having coprae value semantic to library.
* [SPOI-783] - Add having condition interface to support sql having operator semantic.
* [SPOI-784] - Add sql select unary expression semantic to library.
* [SPOI-785] - Create sql binary expreesion index semantic in library.
* [SPOI-786] - Add sql select negate index semantic to library.
* [SPOI-787] - Add sql slect sum index semantic to library.
* [SPOI-788] - Add sql select string mid index semantic to library.
* [SPOI-789] - Add sql slect string len semantic to library.
* [SPOI-790] - Add sql select string upper/lower semantic to library.
* [SPOI-791] - Add sql round double semantic to library.
* [SPOI-792] - Add sql select rtound double semantic to library.
* [SPOI-794] - Add sql sleect count aggregate semantic to libarry.
* [SPOI-795] - Add sql select min/max fucntion semantic to library.
* [SPOI-796] - Add sql select first/last aggregate semantic to library.
* [SPOI-797] - Add sql sleect sum aggregate semantic to library.
* [SPOI-798] - Add pig group operator semanitc to library.
* [SPOI-799] - Add PIG filter operator semantic to library.
* [SPOI-800] - Add PIG cross operator semantic to library.
* [SPOI-801] - Add PIG split operator semantic to library.
* [SPOI-812] - Design wireframes for widget for SiteStats 
* [SPOI-814] - Prototype UI dashboard change to facilitate "app store" paradigm
* [SPOI-815] - Add pig join(inner) semantic operator to library.
* [SPOI-816] - Add pig join(outer => left/right/full) semantic operator to library.
* [SPOI-820] - Implement Dimension Operator that allows custom explosion
* [SPOI-825] - Evaluate non-Hadoop Streaming Platforms IDE
* [SPOI-826] - Add pig order by operator semantic to library.
* [SPOI-827] - Add pig limit operator semantic to library.
* [SPOI-828] - Add pig stream operator semantic to library.
* [SPOI-836] - Design Alert-related API
* [SPOI-840] - Add spark add flat map function semantic to operator library.
* [SPOI-848] - Introduce ContainerLocal as replacement for Inline
* [SPOI-850] - Evaluate Hadoop IDE
* [SPOI-851] - Evaluate JavaScript  data visualization libraries
* [SPOI-858] - Class loader support issue: org.fusesource.hawtbuf.UTF8Buffer.class 
* [SPOI-859] - Evaluate Streaming Platform Back-End Development Workflow
* [SPOI-860] - Evaluate Node.js as Back-End for Site Stats Demo
* [SPOI-864] - Redesign REST for altered escalation approach
* [SPOI-865] - Create "List of Alerts" widget
* [SPOI-866] - Add DataSource methods for alert REST API
* [SPOI-879] - Create a data list of grid nodes
* [SPOI-881] - Create Compute-Local api
* [SPOI-882] - Add compute local api to documents
* [SPOI-884] - Update dhcp configuration on cluster nodes.
* [SPOI-885] - Create prototype with Node.js + Redis + REST for Site Stats
* [SPOI-886] - Implement remove logical operator
* [SPOI-889] - Alerts persistence with Backbone.js models
* [SPOI-893] - Externalize UI settings
* [SPOI-894] - Implement JavaScript Filter operator for Alerts
* [SPOI-910] - Node.js Mock Server and JSONP Cross-Domain Requests
* [SPOI-913] - Flesh out "kill app" command from the instance view
* [SPOI-914] - Alerts REST API Error Handling
* [SPOI-935] - Make patch for flawed start/stop recording mechanism
* [SPOI-939] - Remove references to unfinished features for 0.3.4 release
* [SPOI-943] - Certify Sandbox on various OS
* [SPOI-944] - Certify Sandbox on Mac
* [SPOI-947] - Certify Sandbox for Windows
* [SPOI-948] - Improvements in sandbox based on OS certification feedback
* [SPOI-957] - Update license header
* [SPOI-970] - Download latest G! documents
* [SPOI-985] - Macro argument expansion in stramcli
* [SPOI-1006] - Update @since tags for 0.3.4

## Sub-task
* [SPOI-880] - Investigate options for sandbox environment
* [SPOI-922] - Sandbox default hadoop configurations
* [SPOI-923] - Sandbox demo script and application launcher
* [SPOI-924] - Sandbox size and performance optimizations
* [SPOI-926] - Sandbox documentation
* [SPOI-942] - Demo launch page
* [SPOI-990] - Add launch-demo macro to clirc during install
* [SPOI-1004] - End user license agreement updates

## GitHub - DataTorrent/Malhar
* [12] - Site Stats Operator and TopNOperator issues
* [10] - getTopN() function returns ArrayList in com.datatorrent.lib.util.TopNSort class
* [9] - Another Bug in offer(E e) function of com.datatorrent.lib.util.TopNSort.java
* [8] - Bug in offer(E e) function of com.datatorrent.lib.util.TopNSort.java
* [7] - Add ability to configure timeout of RedisOutputOperator
* [6] - Add a continue on error functionality to AbstractKeyValueStoreOutputOperator
* [5] - Add rollback to AbstractKeyValueStoreOutputOperator.
* [3] - Map Reduce job tracker 
* [2] - Fix application name of mobile demo
* [1] - Console Operators


## Version 0.3.3

## Bug
* [SPOI-418] - Duplicate - Demos need better documentation
* [SPOI-438] - Remove outdated zookeeper dependency from contrib test scope
* [SPOI-456] - CLI: kill-container should accept container number
* [SPOI-464] - Update README to clarify development environment sydtem requirements
* [SPOI-472] - dashboard fails with empty app list
* [SPOI-478] - Recreate a page view on URL change
* [SPOI-509] - Fix UI build on Linux
* [SPOI-517] - Ensure inputPorts and outputPorts are not undefined before merging them
* [SPOI-519] - Investigate Intermittent cease of publishing from Daemon
* [SPOI-527] - divison by zero exception in StreamingContainerManager for calculating throughput
* [SPOI-554] - Fix MergeSort operator and test 
* [SPOI-571] - Siteops demo hangs
* [SPOI-604] - Empty site subdirectory in dist installer
* [SPOI-607] - Auto publish websocket data get stuck
* [SPOI-618] - Start and stop recordings broke from DataSource change
* [SPOI-622] - Get Port REST request fails for running applications after 399
* [SPOI-629] - Fix DataSource.stopOpRecording usage (options object).
* [SPOI-653] - Fix name in package.json
* [SPOI-655] - Fix "Cannot read property 'ports' of undefined" bug with RecordingModel
* [SPOI-659] - PortPageView should override the cleanUp method to unsubscribe to port topic
* [SPOI-669] - Daemon starts secondary process if already running
* [SPOI-673] - Operator List Widget only needs appId, not whole app model instance
* [SPOI-733] - Incorrect documentation in README.txt developer version

## Improvement
* [SPOI-454] - CLI: Feedback when not connected to app
* [SPOI-467] - Backbone.js MVC: View -> Model -> Data Source
* [SPOI-469] - Normalize naming convention for all modules
* [SPOI-500] - Move require calls to widget classes to the top of each page file
* [SPOI-510] - Change API for Datasource module
* [SPOI-512] - Remove dataSource from model attributes
* [SPOI-528] - PortInfoWidget Unit Test
* [SPOI-547] - Convert Notifier module to an Object
* [SPOI-563] - Move WebSocket creation out of DataSource constructor
* [SPOI-582] - Document Front-End Architecture (UML Diagrams)
* [SPOI-596] - Move require calls to the top of pages.js
* [SPOI-602] - Get siteops demo to work without needed high bandwidth for UI
* [SPOI-608] - Rename Page Views according to naming conventions
* [SPOI-615] - Add 'port' to breadcrumb label in port view
* [SPOI-616] - The 'type' attribute in portmodel is not being extrapolated in subscribeToUpdates
* [SPOI-621] - The DataSource should URL-Encode port name in the getPort method
* [SPOI-676] - Return better response for apps.list when no apps running

## New Feature
* [SPOI-135] - Webservice: Provide statistics per streaming operator
* [SPOI-397] - Download Parent Jira
* [SPOI-402] - Document demo examples
* [SPOI-460] - Create Preconfigured Sandbox
* [SPOI-466] - Design and Implement Port View
* [SPOI-468] - Design and Implement Container View
* [SPOI-476] - DT phone home first cut
* [SPOI-503] - Create a pipeline for handling UI feedback
* [SPOI-518] - Implement at most once for Operators with one or zero connected input ports.
* [SPOI-598] - Daemon to serve historical stats data
* [SPOI-700] - Remove demo/groupby

## Sub-task
* [SPOI-453] - Update the mobile demo to version with map
* [SPOI-513] - Move JavaSerializationStreamCodec operator to library/util package
* [SPOI-515] - GitHub Release: Review/format source and docs for library/io/AxctiveMQ Input Operator.
* [SPOI-516] - GitHub repository structure and build system changes
* [SPOI-520] - Test strategy for operators that currently use LocalMode
* [SPOI-521] - Review/fix code formatting / style issues
* [SPOI-524] - Refactor script operators
* [SPOI-526] - Modify library to use CollectorTestSink
* [SPOI-539] - Move PerformanceTestCategory annotation to library
* [SPOI-541] - Port View Unit Tests
* [SPOI-542] - Publish library tests jar
* [SPOI-543] - Remove dependency to Tuple for library tests
* [SPOI-545] - DataSource Unit Tests
* [SPOI-546] - Determine best approach to mocking require()d modules
* [SPOI-552] - RedisOutputOperator stops running abruptly
* [SPOI-553] - Test code for InnerJoin/InnerJoin2 operators
* [SPOI-555] - Fix Unifier in match/change operators
* [SPOI-556] - Graphs show up after a delay with the new ads demo web changes.
* [SPOI-558] - Benchmark tests depend on STRAM
* [SPOI-559] - Move benchmark tests to a separate module
* [SPOI-560] - GitHub release: SumTest math operator still has reference to STRAM
* [SPOI-561] - Duplicate - Separate benchmark tests into a separate module
* [SPOI-562] - Fix HdfsOutputTest to not depend on STRAM
* [SPOI-565] - GitHub release: Change Http operator tests to use mortbay jetty
* [SPOI-566] - Remove reference to StramTestSupport from KafkaInputOperatorTest
* [SPOI-567] - KafkaInputOperatorTest is using DAG
* [SPOI-568] - Modify contrib build to not depend on STRAM
* [SPOI-583] - Implement a sample PubSubWebSocket servlet for testing
* [SPOI-584] - Contrib test classes have dependency to bufferserver
* [SPOI-585] - Implement a helper OperatorContext
* [SPOI-586] - PageLoaderView Unit Tests
* [SPOI-587] - Create SQL operator  base interface/class
* [SPOI-588] - Add SQL Select Oprator  to library
* [SPOI-589] - Create Sql Update operator in library
* [SPOI-590] - Create Sql Delete operator in library
* [SPOI-591] - Create SQL GourpBy/OrderBy Operator in library
* [SPOI-593] - Create SQL Outer join operator in library
* [SPOI-605] - Port View - Info and Overview Widgets
* [SPOI-636] - Apache Open Source Release : Review cods and source code for lirary/algo operator.
* [SPOI-637] - Create output Unifier on library/algo/BottomNOperator.
* [SPOI-639] - Create output port unifier for library/algo/Distinct Operator.
* [SPOI-640] - Create output port unifier for library/algo/FirstMatchMap Operator.
* [SPOI-642] - Create output port unifier for library/algo/FirstMatchStringMap Operator.
* [SPOI-644] - Create output port unifier for library/algo/FirstN Operator.
* [SPOI-645] - HttpOutputOperatorTest is failing
* [SPOI-646] - Create output port unifier for library/algo/InsertSort Operator.
* [SPOI-647] - NavModel/Router Unit Tests
* [SPOI-648] - Remove hash map output port from Insert sort operator.
* [SPOI-649] - Create output port unifier for library/algo/InvertIndex<K, V> Operator.
* [SPOI-650] - Mocha global leaks issue
* [SPOI-651] - Create output port unifier for library/algo/InvertIndexArray<K, V> Operator.
* [SPOI-652] - SlidingWindowTest is failing
* [SPOI-654] - Fix output port unifer for LeastFrequentKey operator.
* [SPOI-658] - Add Mocha Console Reporter
* [SPOI-661] - PageLoaderView Router Navigation Unit Tests
* [SPOI-662] - Refactor Bash Script oPerator.
* [SPOI-663] - Refactor Python script operator.
* [SPOI-664] - Fix output port unifier for MostFrequentKey Operator
* [SPOI-665] - Fix output port unifier for MostFrequentKeyValMap Operator
* [SPOI-666] - Fix output port unifier for libarry/algo/TopN Operator
* [SPOI-667] - Change output port for library/algo/TopNUnique Operator, add output port unifier.
* [SPOI-668] - Remove demo operator TupleOperator from library.
* [SPOI-671] - Create unifier on output port for library/algo/UniqueKeyValOperator
* [SPOI-672] - Remove demo operator : libarry/algo/WindowHolder
* [SPOI-675] - Review source/docs for library/io operators
* [SPOI-684] - Remove stram dependency from hdfs input operator test.
* [SPOI-686] - Fix HTTP output operator and test, failing right now.
* [SPOI-688] - Remove TestTupleCollector from io tests, it is not a test for any thing.
* [SPOI-689] - Remove com.library.io.anootation empty test package.
* [SPOI-690] - Move com.library.io.helper  test to sample library.
* [SPOI-691] - Review source code/docs for library/logs operator.

## Technical task
* [SPOI-557] - Review/change code for MergeSort Operator

## Task
* [SPOI-205] - Protocol for stram to change network/message bus parameters of the outstream of output adapter dnode
* [SPOI-324] - Performance data to be written to HDFS
* [SPOI-459] - Test installation on OS X
* [SPOI-473] - GitHub Release : Code review for library/math operators
* [SPOI-474] - Document mobile demo
* [SPOI-475] - Document twitter demo
* [SPOI-477] - Review/format doc for apche open source release of library operators.
* [SPOI-499] - Review/format doc for apche open source release of library stream operators.
* [SPOI-504] - GitHub Release : Review cods and source code for lirary/multi window operator.
* [SPOI-505] - GitHub Release: Review/Format source/docs/test for AbstractSlidignWindowKeyVal Operator
* [SPOI-506] - GitHub Release : Review/Format source/docs/test for library/MultiSlidingWindowKeyVal Operator
* [SPOI-507] - GitHub Migration: Review/Format source/docs/test for library/SimpleMovingAverage Operator
* [SPOI-508] - GitHub Release : Review/Format source/docs/test for library/MultiSlidingWindowRangeKeyVal Operator
* [SPOI-511] - GitHub Release : Review/Format source/docs/test for library/logs operator
* [SPOI-514] - Open Source Transition for Library/Contrib/Demos
* [SPOI-530] - Operator tests dependent on stram.
* [SPOI-532] - Remove stram dependency from com.datatorrent.lib.testbench.EventGeneratorTest
* [SPOI-533] - Remove stram dependency from com.datatorrent.lib.testbench.RandomEventGeneratorTest
* [SPOI-534] - Remove stram depnedncy from com.datatorrent.lib.testbench.SeedEventGeneratorTest
* [SPOI-535] - GitHub release - Remove stram dependency from com.datatorrent.lib.math.MaxKeyValTest
* [SPOI-536] - Remove stram dependency from com.datatorrent.lib.math.MinKeyValTest
* [SPOI-537] - Remove stram dependency from com.datatorrent.lib.math.MaxMapTest
* [SPOI-540] - Remove stram dependency from com.datatorrent.lib.io.ActiveMQInputOperatorTest
* [SPOI-549] - Create a process for change.log for .3.3 release
* [SPOI-550] - Need license file changes to add DT Phone Home
* [SPOI-564] - Duplicate - Need to update license text to reflect "DT Phone Home"
* [SPOI-572] - Create a library for sql operators
* [SPOI-573] - Move GroupBy to Sql library
* [SPOI-574] - Move innerjoin operator to Sql lib
* [SPOI-575] - Move util/DerbySqlStreamOperator to sql libraray
* [SPOI-576] - Move util/AbstractSqlStreamOperator to sql library
* [SPOI-577] - Move OrderByKey operator to sql library
* [SPOI-578] - move algo/OrderbyKeyDesc operator to sql lib
* [SPOI-579] - move algo/orderbyvalue to sql library
* [SPOI-580] - move algo/orderbyvaluedesc to sql lib
* [SPOI-581] - move algo/innerjoincondition to sql lib
* [SPOI-592] - Create SQL Inner Join Operator in library
* [SPOI-594] - Archive release builds
* [SPOI-601] - Include twitter demo on demo server
* [SPOI-623] - Formalize a release procedure for future release
* [SPOI-625] - Add footer to guides
* [SPOI-626] - Get site ops demo UI to scale
* [SPOI-627] - Site ops demo UI changes
* [SPOI-635] - Ensure notice in html javadocs
* [SPOI-670] - Create output port unifier in libarry/algo/UniqueCounter Operator
* [SPOI-692] - change UI version to match streaming platform version
* [SPOI-697] - Demo of JIRA commits feature
* [SPOI-702] - Create a google groups for GitHub project Malhar
* [SPOI-705] - Setup a server for customer apps



## Version 0.3.2

### Bug
* [SPOI-29] - Pig: A inner join node
* [SPOI-55] - A library module/adapter or node for creating keys from general text
* [SPOI-325] - need better error reporting, not sure what host it is trying to connect to
* [SPOI-412] - UI update rate should be 1 sec (default) and allow customization
* [SPOI-441] - Investigate javadoc errors in build
* [SPOI-452] - recompile embedded zmq with 1.6
* [SPOI-482] - Fix the NPM issue when installing UI in the build process
* [SPOI-490] - Clear chart when switching between operators
* [SPOI-497] - Application dashboard starts flickering if I change the column widths too often
* [SPOI-498] - Update rate on UI - Default and Customize


### Improvement
* [SPOI-326] - Byte code obfuscation for future releases: Allow Malhar platform with premium features to be shared with early customers
* [SPOI-447] - Ability to filter app list in the CLI
* [SPOI-451] - Convert daemon stop/start into single service script
* [SPOI-484] - Add server timestamp to containers info

### New Feature
* [SPOI-69] - Persistence Node: A node to persist/spool every window into storage
* [SPOI-89] - Define and implement a RSS input adapter node
* [SPOI-112] - Versioning: Protocol between StramChild to app master
* [SPOI-121] - Parent jira for supporting Pig programming language
* [SPOI-153] - Heartbeat message
* [SPOI-201] - Parent jira for Checkpointing support in streaming platform
* [SPOI-254] - Design a general purpose read from stream and write to hbase node
* [SPOI-259] - Create db adapters - Need one jira for each db
* [SPOI-330] - Add a sql operator
* [SPOI-332] - Do y! finance demo: calculate last price, volume, time, charts, and moving averages
* [SPOI-333] - Do a pi demo
* [SPOI-334] - Write an RSS read operator
* [SPOI-335] - Add persistance/recording for operator, tuples should be stored in-order
* [SPOI-336] - Add persistance/recording for an port of an operator, tuples should be stored in-order
* [SPOI-343] - Design Malhar Deamon for the UI
* [SPOI-344] - Design for Live as well as Historical data access via daemon/stram
* [SPOI-345] - New optimal buffer server to get around memory issues with netty
* [SPOI-347] - Develop cli commands as a foundational part of an operating system
* [SPOI-348] - Allow commands to run as a script through CLI
* [SPOI-356] - Input adapter for DRUID
* [SPOI-357] - Output Adapter for DRUID
* [SPOI-362] - Create Alert operator that does moving average and alerts if that drops by more than X%
* [SPOI-365] - Output Adapter for Redis
* [SPOI-374] - Size limits on log files (STRAM mainly)
* [SPOI-380] - Add security to STRAM
* [SPOI-383] - Implement do-As
* [SPOI-386] - Design latency computations
* [SPOI-387] - Design CPU, Memory, and Network IO usage
* [SPOI-388] - Added resource usage to stats and access via webservice
* [SPOI-391] - Design and implement at least once
* [SPOI-394] - Add input adapter for Redis
* [SPOI-395] - Create an output adapter for Redis
* [SPOI-398] - Test download on Amazon
* [SPOI-405] - Design, document, and test download to work with Apache Hadoop
* [SPOI-416] - Local only Download licensing
* [SPOI-426] - Create an attribute that forces the checkpoint to align with application window boundary
* [SPOI-479] - Design and implement ad data charting
* [SPOI-481] - UI design for application platform charting (live and historical dimensional data)
* [SPOI-485] - Placeholder for list of possible UI work for Summit
* [SPOI-486] - Enable security in the UI (need to check that the user has permission)
* [SPOI-487] - Design and implement new SVG charts
* [SPOI-489] - Alerts
* [SPOI-491] - Create login error pages for UI on secure cluster
* [SPOI-492] - Design UI for resources and latency data
* [SPOI-493] - Design and implement per operator view
* [SPOI-494] - Design and develop the "Operations" dashboard
* [SPOI-495] - The recording tab should show list of recordings by operator or by operator:port
* [SPOI-496] - Securitiy UI (sign-in, get token from deamon, etc.)

## Story
* [SPOI-371] - Review Storm features vs our open source plan
* [SPOI-372] - Ensure that premium feature implementation is hard for outsiders to do on the open source tree

## Task
* [SPOI-14] - Dynamic run time optimization framework: Load balancing and load shedding
* [SPOI-39] - Should be able to track window id through the DAG
* [SPOI-40] - Output messages of each node should be persisted/buffered
* [SPOI-63] - Output Adapter logging
* [SPOI-64] - Levels in logging
* [SPOI-231] - Demo tweeter feed analysis on Hadoop 2.0 with basic streaming setup
* [SPOI-273] - Setup CI and run existing demos to ensure that code does not break any
* [SPOI-419] - Certify our build on Amazon
* [SPOI-420] - Convert mobile location demo to a google maps demo
* [SPOI-421] - Ensure that checkpointing happens at Application window boundary
* [SPOI-422] - Allow an operator developer to enable checkpointing within an application window
* [SPOI-423] - Have a "ALLOW_CHECKPOINT_WITHIN_WINDOW" attribute (default is FALSE)
* [SPOI-424] - Document new checkpointing logic in app dev guide and op dev guide, add attribute to operations guide
* [SPOI-442] - ASF License header for downloadable sources
* [SPOI-443] - Packaging for dev and cluster versions
* [SPOI-480] - Add aggregate i/o buffer server bytes for application level
* [SPOI-483] - Tie up loose ends for summit version
* [SPOI-488] - Remove failure count column from "Live" table
