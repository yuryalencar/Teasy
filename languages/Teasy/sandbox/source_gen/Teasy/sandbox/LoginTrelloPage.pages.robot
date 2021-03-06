*** Settings ***
Documentation       Page of application
...
...                 Contains all keywords (actions) presents in
...                 application page.
 
Resource            ../components/components.robot

*** Keywords ***
LoginWithYuryUser
      Input Text                                    ${LoginEmailInput}            example@gmail.com     clear=True
      Input Text                                    ${LoginPasswordInput}            example     clear=True
      Click Element                                 ${LoginButton}
