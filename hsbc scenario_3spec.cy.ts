before(() => {
    // Set the viewport to the screen's width and height
    cy.viewport(window.screen.width, window.screen.height);

    // Task 1: Open the HSBC India website 
    cy.visit('https://www.hsbc.co.in'); 
});

it('HSBC Credit Card Flow', () => {
    // Prevent uncaught exceptions to avoid test failure
    Cypress.on('uncaught:exception', (err, runnable) => {
        if (err.message.includes('Cannot read properties of null')) {
            return false;  // Prevent Cypress from failing the test on this error
        }
        return true;
    });

    // Task 2: Hover and click cursor on Banking menu navigation
    cy.get('.header-main-navigation-item').contains('Banking').click();  // Click on "Banking" menu item

    // Wait for the page to load by checking for an element that only appears on the Credit Cards page
    cy.wait(2000); // Wait for the page to load (or adjust the wait time)

    // Ensure the "Credit cards" header is visible and contains the expected text
    cy.get('h2').should('be.visible').and('contain.text', 'Credit Cards');

  // Check that the header contains 'Credit cards'

    // Task 3: Click on Credit Cards Link
    cy.get('a.doormat-heading-link').contains('Credit Cards').eq(0).click({ force: true });

    // Task 4: Validate Credit Card as a header text
    cy.get('h1').should('contain.text', 'Credit cards');  // Ensure the header contains the expected text
});
