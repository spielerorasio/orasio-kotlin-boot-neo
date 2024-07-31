
### How to use 

load neo4j  - for example

* docker run  -itd --publish=7474:7474 --publish=7687:7687 --env NEO4J_AUTH=neo4j/password     neo4j:latest
* go to http://localhost:7474/browser/
* try sample scripts (movie graph)

###Clone this git repository


./gradlew bootRun


### API to use

* GET http://localhost:8080/movies
* GET http://localhost:8080/movies/by-title?title=Cloud%20Atlas
    runs MATCH (cloudAtlas {title: "Cloud Atlas"}) RETURN cloudAtlas
* PUT http://localhost:8080/movies


{
"title": "John Doe",
"description": "John is connected",
"actors": [
{
"name": "Tom Hanks",
"born": 1956
},
{
"name": "John Doe",
"born": 1921
}
],
"directors": [
{
"name": "John Director",
"born": 1933
}
]
}



* DELETE http://localhost:8080/movies/172
