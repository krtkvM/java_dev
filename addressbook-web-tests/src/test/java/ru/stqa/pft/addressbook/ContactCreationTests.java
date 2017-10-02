package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

     @Test
    public void testContactCreation() {
         initCreateContact();
         fillContactForm(new ContactData("Василий", "Котович", "Котовский", "comanderCat", "Такие дела", "ООО", "test. 123", "89207894564", "89201234567", "n/a", "n/a", "василий.котовскийкотович.1@ооо"));
         submitContactCreation();
         returnHomePage();
     }

}
