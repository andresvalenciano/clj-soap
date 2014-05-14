(defproject org.clojars.seancorfield/clj-soap "0.2.1-SNAPSHOT"
  :description "SOAP Client and Server using Apache Axis2."
  :url "https://github.com/seancorfield/clj-soap"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/core.incubator "0.1.2"]
                 [org.apache.axis2/axis2-adb "1.6.2"]
                 [org.apache.axis2/axis2-transport-http "1.6.2"]
                 [org.apache.axis2/axis2-transport-local "1.6.2"]
                 [org.clojure/tools.logging "0.2.6"]
                 [log4j "1.2.15" :exclusions [javax.mail/mail
                                              javax.jms/jms
                                              com.sun.jdmk/jmxtools
                                              com.sun.jmx/jmxri]]]
  :source-paths ["src" "test"]
  :aot [clj-soap.test.core])
