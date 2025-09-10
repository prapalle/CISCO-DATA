 // Scenario 1: HSBC Login Test Scenario.

before(() => {
// Set the viewport to the screen's width and height
 cy.viewport(window.screen.width, window.screen.height);
 // Task 1: Open the HSBC India website cy.visit('https://www.hsbc.co.in');
 cy.visit('https://www.hsbc.co.in');
});

it('Validates the HSBC Bank Logo and Login Flow', () => {

// Task 2: Validate HSBC Bank Logo

cy.get('img[src="/content/dam/hsbc/in/images/01_HSBC_MASTERBRAND_LOGO_RGB.svg"]')
  .debug() // To print the element's details in the Cypress console
  .should('be.visible');



// Task 3: Validate Home Page Title
cy.title().should('eq', 'HSBC India - Credit Cards, NRI Services, Saving and Deposit');

  
 //Task 4: Click on Login button
cy.contains('Log On').click();

// Task 5: Click on 'Continue to log on with browser' button if it exists 21

//cy.contains("Continue to log on with browser").then(($button) =>{ 
    //if($button.length){
  //      cy.wrap($button).click();

// Wait for 2 seconds to ensure the page is fully Loaded
    //    cy.wait(5000);
 //}

//);



 // Task 6: Validate Log On header in Login page

cy.get('span').should('contain', 'Log On');
 // Task 7: Check if the Continue button is visible and initially disabled 
 cy.get('button[type="submit"]').should('be.visible').and('be.disabled');



//Task 8: Type any random email in the username field

cy.get('input[id="username"]').type('praeeppalle@cypress-test.com');


// Task 9: Now check Continue button is Enabled

 cy.get('button[type="submit"]').should('not.be.disabled');





cy.get('input[type="checkbox"]').should('not.be.checked');

 // Task 14: Volidate that there is a Close button in the new pop-up screen


// Task 10: Validate Remember me check box is not checked by default

// Task 11: Validate that there is a question mark tooltip present on the pag

cy.get('span.icon-circle-help-solid.help-icon').should('be.visible');

// Task 12: Click on the tουιτέρ

cy.get('span.icon-circle-help-solid.help-icon').click();

// Task 13: Validate the username header in the new pop-up screen cy.get('span').should('contain", 'Username');

cy.get('span.icon-delete').should('be.visible');

cy.wait(3000);



 // Task 15: Click on the tooltip icon again to close the pop-up screen 68 cy.get('span.icon-circle-help-solid.help-icon').click();

 });
