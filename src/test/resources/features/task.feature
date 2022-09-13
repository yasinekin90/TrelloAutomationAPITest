@wip
Feature: create board and cards on trello

  Scenario: verify create
  Given Trello üzerinde bir board oluşturunuz.
  When  Oluşturduğunuz board üzerinde bir list oluşturunuz.
  When  Oluşturduğunuz board’ a 2 tane kart oluşturunuz.
  And   Oluştrduğunuz bu iki karttan random olacak sekilde bir tanesini güncelleyiniz.
  Then  Oluşturduğunuz kartları siliniz.
  Then  Oluşturduğunuz board’ u siliniz.