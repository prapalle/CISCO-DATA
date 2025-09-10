it('should find element using XPath', () => {
  cy.visit('https://example.com'); // Use a URL of your choice
  cy.xpath('//h1').should('be.visible');
});
