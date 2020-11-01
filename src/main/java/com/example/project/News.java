package com.example.project;

public class News {
private String title;
private String section;
private Results[] results;

public Results[] getResults() {
  return results;
}

public void setResults(Results[] results) {
  this.results = results;
}

public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getSection() {
	return section;
}
public void setSection(String section) {
	this.section = section;
}

}
