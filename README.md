# CSIChatAE
CSIChatAE messaging app allows people to exchange messages between 2 people providing end-to-end encryption.
This end-to-end encryption protocol is designed to prevent third parties from having plaintext access to messages.
What’s more, even if encryption keys from a user’s device are ever physically compromised, they cannot be used to go back in time to decrypt previously transmitted messages.
We are going to use the the Open Whisper Signal Encryption model and Improvise with a more efficient Elliptic Curve element.

## Public Key Types Used 
•Identity Key Pair – A long-term Curve key pair, generated at install time.
•Signed Pre Key – A medium-term Curve key pair, generated at install time, signed by the Identity Key, and rotated on a periodic timed basis.
•One-Time Pre Keys – A queue of Curve key pairs for one time use, generated at install time, and replenished as needed.

## Session Key Types Used
•Root Key – A 32-byte value that is used to create Chain Keys.
•Chain Key – A 32-byte value that is used to create Message Keys.
•Message Key – An 80-byte value that is used to encrypt message contents. 32 bytes are used for an AES-256 key, 32 bytes for a HMAC-SHA256 key, and 16 bytes for an IV.

## Client Registration methodology
At registration time, a client transmits its public Identity Key, public Signed Pre Key (including signature), and a batch of public One-Time Pre Keys to the server. The server stores these public keys associated with the user’s identifier. At no time does the server has access to any of the client’s private keys.

## Sessions

The App Protocol is session-oriented.  Clients establish a "session," which is then used for all subsequent encrypt/decrypt operations.  There is no need to ever tear down a session once one
has been established.

Sessions are established in one of three ways:

1. PreKeyBundles. A client that wishes to send a message to a recipient can establish a session by retrieving a PreKeyBundle for that recipient from the server.
1. PreKeySignalMessages.  A client can receive a PreKeySignalMessage from a recipient and use it to establish a session.
1. KeyExchangeMessages.  Two clients can exchange KeyExchange messages to establish a session.


# Implementation
The project is implemented in 4 phases

Phase 1. Designing basic Android application for testing purpose

Phase 2. Designing Algorithm based on the Open Whisper System model and implementing those algorithm in the android app.

Phase 3. Refining the Android App and connecting the app to the local server.

Phase 4. Testing the app and encryption using different methods.

# Current Status
Phase 1 as been completed along with the coding of basic AES and SHA algorithms. The detailed research is required for choosing the Elliptic Curve. Phase 3 will be started in 2nd week of March.

