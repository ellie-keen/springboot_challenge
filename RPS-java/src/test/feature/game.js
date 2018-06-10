module.exports = {
  'Play move' : function (client) {
    client
      .url("http://localhost:8080/")
      .waitForElementVisible('body', 3000)
      .assert.containsText('body', 'Choose a move')
      .setValue('#react > div > form > input[type="text"]:nth-child(1)', 'rock')
      .click('#react > div > form > input[type="submit"]:nth-child(2)')
      .end()
  }
}