Feature: Web Table general functionality verification

  @dropdownProduct
  Scenario: Dropdown option verification
    Given user is already logged into The Web table app
    When user is on the “Order” page
    Then user sees below options under “product” dropdown
      | MoneyCog   |
      | Familybea  |
      | Screenable |

  @radioButtons
  Scenario: Payment options verifications
    Given user is already logged into The Web table app
    When user is on the “Order” page
    Then user sees radio button Visa enabled
    Then user sees radio button Mastercard enabled
    Then user sees radio button American Express enabled

  @orderPlacement1
  Scenario: Order placement (parameterized)
    Given user is already logged into The Web table app
    When user is on the “Order” page
    And user enters quantity "2"
    And user clicks Calculate button
    And user enters Name "Masha"
    And user enters street "Perfect"
    And user enters City "Houston"
    And user enters State "TX"
    And user enters zip "77645"
    And user choose Card type "Visa"
    And user enters Card number "1111222233334444"
    And user enters expiration date "03/12"
    And user click process Order button
    Then user should see "Masha" in the first row of the web table

  @orderPlacement2
  Scenario Outline: Order placement (outlined)
    Given user is already logged into The Web table app
    When user is on the “Order” page
    And user enters quantity "<quantity>"
    And user clicks Calculate button
    And user enters Name "<CustomerName>"
    And user enters street "<street>"
    And user enters City "<city>"
    And user enters State "<state>"
    And user enters zip "<zip>"
    And user choose Card type "<cardType>"
    And user enters Card number "<cardNo>"
    And user enters expiration date "<cardExp>"
    And user click process Order button
    Then user should see "<ExpName>" in the first row of the web table
    Examples:
      | quantity | CustomerName | street   | city       | state    | zip   | cardType | cardNo           | cardExp | ExpName |
      | 3        | Masha        | paradise | Houston    | TX       | 77123 | Visa     | 1111222233334444 | 03/12   | Masha   |
      | 3        | Katya        | paradise | NY         | NY       | 77123 | Visa     | 1111222233334444 | 03/12   | Katya   |
      | 3        | Vasya        | paradise | Washington | Maryland | 77123 | Visa     | 1111222233334444 | 03/12   | Vasya   |
      #| 3        | Olya         | paradise | Phoenix    | AZ       | 77123 | Visa     | 1111222233334444 | 03/12   | Olya    |
      #| 3        | Petya        | paradise | LA         | CA       | 77123 | Visa     | 1111222233334444 | 03/12   | Petya   |

