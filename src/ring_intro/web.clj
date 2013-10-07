(ns ring-intro.web
  (:require       
    [noir.core :refer [defpage defpartial]]
    [hiccup.core :refer :all]
    [hiccup.page :refer :all]
    [hiccup.form :refer :all]
    [hiccup.element :refer :all]))

(defpartial layout [& content]
  (html
    [:head
      [:title "Der Ring des Nibelungen"] 
      (include-css "http://yui.yahooapis.com/pure/0.3.0/base-min.css")
      (include-css "http://yui.yahooapis.com/pure/0.3.0/pure-min.css")]
    [:body content]))


(defpage [:get "/"] {}
  (layout [:h1 "Hello Clojure!"]))