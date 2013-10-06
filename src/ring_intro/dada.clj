(ns enterpriceless.users
    (:require [somnium.congomongo :as m]))

(def conn
  (m/make-connection "mock"
                     :host "127.0.0.1"
                     :port 27017))

(m/set-connection! conn)

;; (m/fetch-one coll :where map), e.g. (m/fetch-one :users :where {:username username}) 
;; (m/fetch coll :where map)
;; (m/update! coll {:_id id} map)