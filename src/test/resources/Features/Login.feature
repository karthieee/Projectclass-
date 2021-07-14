Feature: Verifying Adactin details

  @Smoke
  Scenario Outline: Verifying Adactin login details with valid credentails
    Given user is on the Adactin login page
    When user should login "<username>" and "<password>"
    And user should enter "<location>","<hotels>", "<roomType>", "<noOfRoom>", "<adultPerRoom>", "<childrenPerRoom>"
    And user should select hotel name
    And user should book a hotel in booking page "<firstname>", "<lastname>", "<address>","<creditCardNo>","<creditCardType>","<expiryMonth>","<expiryYear>","<cvvNumber>"
    Then user should verify order Id

    Examples: 
      | username       | password | location  | hotels         | roomType     | noOfRoom | adultPerRoom | childrenPerRoom | firstname | lastname | address | creditCardNo     | creditCardType   | expiryMonth | expiryYear | cvvNumber |
      | karthikeyaneee |   123456 | Melbourne | Hotel Sunshine | Super Deluxe | 1 - One  | 1 - One      | 0 - None        | karthi    | Keyan    | Chennai | 1234567891234567 | American Express | December    |       2021 |       321 |

  @Reg
  Scenario Outline: Verifying Adactin login details with valid credentails
    Given user is on the Adactin login page
    When user should login "<username>" and "<password>"

    Examples: 
      | username       | password |
      | karthikeyaneee |   123456 |

  @Sanity
  Scenario Outline: Verifying Adactin login details with valid credentails
    Given user is on the Adactin login page
    When user should login "<username>" and "<password>"
    And user should enter "<location>","<hotels>", "<roomType>", "<noOfRoom>"
    
    Examples:

      | username       | password | location  | hotels         | roomType     | noOfRoom |
      | karthikeyaneee |   123456 | Melbourne | Hotel Sunshine | Super Deluxe | 1 - One  |
