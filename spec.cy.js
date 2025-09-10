it('should use xpath', () => {
  cy.visit('https://example.com');
  cy.xpath('//h1').should('be.visible');
});
