$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/featurefile/feature1.feature");
formatter.feature({
  "name": "To login into whatsapp web",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Launch whatsapp web",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "To navigate url",
  "keyword": "Given "
});
formatter.match({
  "location": "whatsapp.steps.WebWhatsapp.to_navigate_url()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat Utility.FunctionalLibrary.browserFactory(FunctionalLibrary.java:43)\r\n\tat whatsapp.steps.WebWhatsapp.to_navigate_url(WebWhatsapp.java:18)\r\n\tat ✽.To navigate url(file:///C:/Users/ELCOT/eclipse-workspace/webwhatsapp/./src/test/java/featurefile/feature1.feature:4)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "whatsapp launched click on the menu",
  "keyword": "When "
});
formatter.match({
  "location": "whatsapp.steps.WebWhatsapp.whatsapp_launched_click_on_the_menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "profile page appears edit username",
  "keyword": "When "
});
formatter.match({
  "location": "whatsapp.steps.WebWhatsapp.profile_page_appears_edit_username()"
});
formatter.result({
  "status": "skipped"
});
});