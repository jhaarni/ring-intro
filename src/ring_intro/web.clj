(ns ring-intro.web
  (:require   [noir.core :refer [defpage defpartial]]
    [hiccup.core :refer :all]
    [hiccup.page :refer :all]
    [hiccup.element :refer :all]))

(defpartial layout [& content]
  (html
    [:head
    [:title "Der Ring des Nibelungen"]]
                                     ;^(include-css "some.css")]
    [:body
    content]))

(defpage [:get "/"] {}
  (layout [:h1 "Hello Ring!"]))