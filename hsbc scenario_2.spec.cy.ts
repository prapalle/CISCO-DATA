// Scenario 2: HSBC ATM Search Test Scenario

before(() => {

// Task : Set the viewport to the screen's width and height

cy.viewport(window.screen.width, window.screen.height);

// Task 1: Open the HSBC India website

cy.visit('https://www.hsbc.co.in'); });

it('Finds the nearest branch or ATM', () => {



// Task 2: Scroll down to the bottom of the page


cy.scrollTo('bottom');

// Task 3: Click on Find your nearest branch or ATM Link in footer section us ing href attribute
cy.xpath('//nav[@aria-label="Main Footer Navigation"]//ul[@class="footer-large"]//li[@class="footer-large-item lg-3"]//a[@href="/ways-to-bank/branches/"]').click();


cy.wait(4000)

// Task 4: Validate in new page the URL has String '/ways-to-bank/branche 5/

cy.url().should('include', '/ways-to-bank/branches/');

// Task 5: Validate Header as Branches & ATM
cy.get('h1').should('contain', 'Branches & ATM');

// Task 6: Click on 'Branch & ATM Locator' button


cy.contains('Branch & ATM Locator').click();

// Task 7: Type country name as India




it('should type in search input and verify the value', () => {
    // Alias the input field
    cy.get('input#searchInput').as('inputField');
  
    // Type into the input field
    cy.get('@inputField').type('Some text');
    
    // Optionally, add a small wait if the page re-renders asynchronously
    cy.wait(1000);  // Adjust wait time as necessary
    
    // Re-query the input field and verify the final value
    cy.get('@inputField').should('have.value', 'Some text'); // Verify the final value
  });
  



// Task 6: Click on 'Branch & ATM Locator button

// Task 8: In drop-down option click option India

cy.get('#searchInput').first().click();

cy.get('#searchInput').type('{enter}');

cy.wait(2000);

// Task 9: Validate ATM Header name is showing as Somajiguda

it('should validate the ATM header name as Somajiguda', () => {
    cy.get('#searchInput').type('{enter}'); // Trigger the search action
    
    // Wait for the element to load (increase wait time if needed)
    cy.wait(2000); // Adjust wait time as needed
    
    // Use the exact class name to get the h2 element and validate the text
    cy.get('h2.V7x_3QCHrU3Xe1oeCMyy')
      .should('exist')             // Ensure the element exists
      .and('be.visible')           // Ensure the element is visible
      .and('contain.text', 'Somajiguda'); // Assert the text is "Somajiguda"
  });
  


// Task 10: Click on "Show more results button

it('should click on "Show more results" button', () => {
    // Wait for the button to become visible (increase timeout if necessary)
    cy.contains('Show more results', { timeout: 10000 })  // Wait for up to 10 seconds for the element
      .should('be.visible')  // Ensure the button is visible
      .click();              // Click on the button once visible
    
    // Task 11: Check if the second ATM branch name tooltip is visible with the number '2' in red color
    cy.xpath('/html/body/div[3]/div/div[2]/div/span[1]/a')
      .should('be.visible');  // Ensure the element is visible
    cy.xpath('/html/body/main/div[2]/div/div[2]/div/div/div[1]/div/ul/11[2]/button/p[1]/span/span')
      .should('contain.text', '2');  // Check the number '2' is displayed
  });
  

    it('should check social media links in footer', () => {
        // Check Instagram link
        cy.xpath('/html/body/div[3]/div/div[2]/div/span[1]/a').should('be.visible');
      
        // Check Facebook link
        cy.xpath('/html/body/div[3]/div/div[2]/div/span[3]/a').should('be.visible');
      
        // Check Twitter link
        cy.xpath('/html/body/div[3]/div/div[2]/div/span[4]/a').should('be.visible');
      
        // Check LinkedIn link
        cy.xpath('/html/body/div[3]/div/div[2]/div/span[5]/a').should('be.visible');
      
        // Check second ATM branch button, fix the XPath to use li[2] instead of 11[2]
        cy.xpath('/html/body/main/div[2]/div/div[2]/div/div/div[1]/div/ul/li[2]/button/p[1]/span/span')
          .should('be.visible')
          .and('contain.text', '2'); // Validate that it contains the number "2"
      });
      
// Task 16: Click on HSBC Logo

it('should navigate to home page and validate the title', () => {
    // Click on the HSBC India Bank image to navigate to the homepage
    cy.get('img[alt="HSBC India Bank"]').first().click();
  
    // Wait for the page to load and validate the page title
    cy.title().should('eq', 'HSBC India - Credit Cards, NRI Services, Saving and Deposit');
  });
  
// Task 18: Scroll down to the bottom again

 cy.scrollTo('bottom');
// Task 19: Check and Click on Privacy Link

cy.xpath('/html/body/footer/div[2]/div/div/nav/ul/li[3]/a').should('be.visible').click();

// Task 20: Validate Privacy Statement as Header

cy.get('h1').should('contain', 'Privacy Statement');

 });

