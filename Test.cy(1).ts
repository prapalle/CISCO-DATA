describe('Horizontal Form Test', () => {
  
    // Test case to visit the main page
    it('should visit the page on localhost:4200', () => {
      cy.visit('http://localhost:4200'); // Navigate to the homepage
    });
  
    // Test case to navigate to the Form Layouts page
    it('should click on Forms and Form Layouts', () => {
      cy.contains('Forms').click(); // Click on 'Forms' in the menu
      cy.contains('Form Layouts').click(); // Click on 'Form Layouts'
    });
  
    // Test case to open the Horizontal Form from the menu
    it('should interact with the menu to open Horizontal Form', () => {
      cy.get('g[data-name="menu-2"]').click(); // Click on the menu item that opens the Horizontal Form
    });
  
    // Test case to check the visibility of the Horizontal Form
    it('should locate and verify the visibility of the Horizontal Form', () => {
      cy.contains('Horizontal form')
        .scrollIntoView() // Scroll to the element if necessary
        .should('be.visible'); // Ensure the Horizontal Form is visible on the page
    });
  
    // Test case to input an email in the Horizontal Form
    it('should find the Horizontal Form and input email', () => {
      cy.contains('Horizontal form')
        .closest('nb-card') // Find the closest nb-card to the 'Horizontal form'
        .find('form.form-horizontal') // Locate the form
        .within(() => {
          cy.get('[placeholder="Email"]').type('example@example.com'); // Type in the email field
        });
    });
  
    // Test case to input a password in the Horizontal Form
    it('should find the Horizontal Form and input password', () => {
      cy.contains('Horizontal form')
        .closest('nb-card')
        .find('form.form-horizontal')
        .within(() => {
          cy.get('[placeholder="Password"]').type('password123'); // Type in the password field
        });
    });
  
    // Test case to click the custom checkbox
    it('should click the custom checkbox', () => {
      cy.contains('Horizontal form')
        .closest('nb-card')
        .find('form.form-horizontal')
        .within(() => {
          cy.get('.custom-checkbox').click(); // Click the custom checkbox
        });
    });
  
    // Test case to click the "Sign In" button
    it('Should click the "Sign In" button using the data-cy attribute', () => {
      cy.contains('Horizontal form')
        .closest('nb-card')
        .find('form.form-horizontal')
        .within(() => {
          cy.get('[data-cy="signInButton"]').click(); // Click the "Sign In" button
        });
    });
  
    // Test case to assert that the "Sign In" button exists after clicking
    it('Should assert that the "Sign In" button exists after clicking', () => {
      cy.contains('Horizontal form')
        .scrollIntoView()
        .should('be.visible')
        .closest('nb-card')
        .find('form.form-horizontal')
        .within(() => {
          cy.get('[data-cy="signInButton"]').should('exist'); // Assert that the Sign In button still exists
        });
    });
  });
  
  describe('Radio Button Test', () => {
    it('Should interact with radio buttons on localhost:4200', () => {
      // Step 1: Visit the website
      cy.visit('http://localhost:4200');
    });
  
    it('Should navigate to the form layout', () => {
      // Step 2: Navigate to the form layout
      cy.contains('Forms').click();
      cy.contains('Form Layouts').click();
  
      cy.get('g[data-name="menu-2"]').click();
    });
    
    it('Should find all radio buttons', () => {
      // Step 3: Find all three radio buttons
      cy.get('nb-radio-group nb-radio').as('radioButtons'); // Alias for the radio buttons
    });
  
    it('Should inspect and click on the first radio button', () => {
      // Step 4: Inspect and click on the first radio button
      cy.get('nb-radio-group nb-radio').as('radioButtons'); // Alias for the radio buttons
      cy.get('@radioButtons')
        .eq(0) // Select the first radio button
        .find('input[type="radio"]') // Target the input element
        .should('be.enabled') // Ensure it is enabled
        .click({ force: true }) // Click on it
        .should('be.checked'); // Verify it is checked
      });
  
    it('Should inspect and click on the second radio button', () => {
      // Step 5: Inspect and click on the second radio button
      cy.get('nb-radio-group nb-radio').as('radioButtons'); // Alias for the radio buttons
      cy.get('@radioButtons')
        .eq(1) // Select the second radio button
        .find('input[type="radio"]') // Target the input element
        .should('be.enabled') // Ensure it is enabled
        .click({ force: true }) // Click on it
        .should('be.checked'); // Verify it is checked
      });
  
    it('Should validate that the first radio button is not selected', () => {
      // Step 6: Validate that the first radio button is not selected
      cy.get('nb-radio-group nb-radio').as('radioButtons'); // Alias for the radio buttons
      cy.get('@radioButtons')
        .eq(0) // Select the first radio button
        .find('input[type="radio"]') // Target the input element
        .should('not.be.checked'); // Ensure it is not selected
      });
  
    it('Should validate that the third radio button is disabled', () => { 
      // Step 7: Validate that the third radio button is disabled
      cy.get('nb-radio-group nb-radio').as('radioButtons'); // Alias for the radio buttons
      cy.get('@radioButtons')
        .eq(2) // Select the third radio button
        .find('input[type="radio"]') // Target the input element
        .should('be.disabled'); // Verify it is disabled
    });
  });
  
  
  describe('Modal and Checkbox Test', () => {
    
    // Test case to visit the website and navigate to Modals & Overlays
    it('should open the website and navigate to Modals & Overlays', () => {
      cy.visit('http://localhost:4200'); // Visit the site
      cy.contains('Modal & Overlays').click(); // Click on 'Modal & Overlays'
    });
  
    // Test case to interact with the toaster notification
    it('should inspect the toaster and click on it', () => {
      cy.contains('Toastr').click(); // Click on the 'Toastr' link
    });
  
    // Test case to open the Horizontal Form menu again
    it('should interact with the menu to open Horizontal Form', () => {
      cy.get('g[data-name="menu-2"]').click(); // Click on the menu for Horizontal Form
    });
  
    // Test case to check all checkboxes in the form
    it('should check all checkboxes', () => {
      cy.get('nb-checkbox input[type="checkbox"]').check({ force: true }); // Check all checkboxes
    });
  
    // Test case to click only the second checkbox
    it('should click only on the second checkbox', () => {
      cy.get('nb-checkbox') // Select the second checkbox
        .eq(1)
        .find('input[type="checkbox"]')
        .click({ force: true }); // Click it to check
    });
  });
  