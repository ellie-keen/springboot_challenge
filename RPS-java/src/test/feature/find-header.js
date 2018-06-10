module.exports = {
  'Find header' : function (client) {
    client
      .url("http://localhost:8080/")
      .waitForElementVisible('body', 3000)
      .assert.containsText('body', 'Choose a move')
      .end()
  }
}