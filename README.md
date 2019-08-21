# Deploy
```bash
mvn install:install-file \
   -Dfile= C:\Users\Adams\Desktop\projects\kampstrup-integration\target\kamstrup-integration-1.0.jar\
   -DgroupId=com.kaiote.kamstrupint \
   -DartifactId=kamstrup-integration \
   -Dversion=1.0 \
   -Dpackaging=jar \
   -DgeneratePom=true
```


## Decrypting and decoding Sigfox meter data
This is an example for decrypting and decoding data from the Kamstrup MULTICAL 21 ultrasonic water
meter with radio module 11 , communicating via Sigfox network.
For reference, please see these documents:

- Datasheet: [http://products.kamstrup.com/download.php?uid=515d4ab](http://products.kamstrup.com/download.php?uid=515d4ab)
- Technical Description: [http://products.kamstrup.com/download.php?uid=515d4b410de](http://products.kamstrup.com/download.php?uid=515d4b410de)

The meter specific XML based key file and the Sigfox Data file can be downloaded from your MyKam-
strup account https://www.kamstrup.com/en-en/my-kamstrup-login, see
https://www.kamstrup.com/en-en/my-kamstrup-guides for help.

XML file for example meter:

Sigfox data file for example meter:

```xml
    <?xml version="1.0" encoding="utf-8"?>
    <MetersInOrder orderid="" schemaVersion="2.0">
    <Meter>
    <MeterNo>57722719</MeterNo>
    <SerialNo>57722719</SerialNo>
    <EncKeys>
    <DEK>C2E387277E39C9D821F3B05E1616F87C</DEK>
    </EncKeys>
    <MeterName>MC21</MeterName>
    <ConsumptionType>VolumeCold</ConsumptionType>
    <ConfigNo>0100200023133</ConfigNo>
    <ProgramNo>
    </ProgramNo>
    <TypeNo>02111C04894</TypeNo>
    <VendorId>KAM</VendorId>
    </Meter>
    </MetersInOrder>
```
```bash
Device PAC Meter Number
007D47BC1C2FEBF6D5837DAD 57722719
```

## Sigfox received message:

Structure of Sigfox message, showing fields, field lengths and content:

Message payload part (last 10 bytes) of the data is encrypted using AES-128 CTR. The input to decryp-
tion function is the payload , DEK (16 bytes key from XML file) and IV (constructed by repeating AES Cnt
up to 16 bytes).

The following calculator can be used to verify decryption: [http://www.cryptogrium.com/aes-ctr.html](http://www.cryptogrium.com/aes-ctr.html)

In this example, the encrypted payload is decrypted as

Calculate and verify the CRC over the 8 data bytes of the Decrypted Message. The CRC- 16 algorithm is
CCIT_ZERO (0x1021) with start value 0x0000, no final XOR and no inversions.

The following calculator is used as a check: [http://www.sunshine2k.de/coding/javascript/crc/crc_js.html](http://www.sunshine2k.de/coding/javascript/crc/crc_js.html)

```
c164ed406d8d6f1d8715f
```
```
    PackID | AES | Cnt |
    ====================
    1 | 1
    c1 | 64 | ed406d8d6f1d8715f
```
```
Encrypted Payload
10
```
```
0000b78400006f010e
```
```
8 2
```
```
Decrypted Message CRC
```
```
0000b78400006f01 930e
```

PackID determines the structure and units of the message:

For this example, PackID is decoded as

From PackID, PackageType determines the content of the package:

For this example, the content for PackageType = 1 is decoded as

This shows that the total consumption volume, V1, on the meter is 33.975 m^3 , using the equation

The maximum flow rate is 0.367 L/hr.

InfoCode identifies any active alarms and how long they have been active in the last 30 days. The LSB 4
bits indicate active alarms and represent DRY, REVERSE, LEAK and BURST. The hour counters are repre-
sented by the 12 MSB bits as 3 bits each.

```
bin
Decimals Units Log PackageType
8 2 2 1 3
hex 03 00 0 001
text 3 m3 & L/hr Day 1
```
```
11000001
```
```
Info V1 Max Flow
2 4 2
0000 000084b7 016f
33.975 0.
```
```
0000b78400006f
```
```
Burst Leak Reverse Dry Burst Leak Reverse Dry
3 3 3 3 1 1 1 1
```

The values for the hour counters are decoded as

For example InfoCode = 0x71 = 113 would decode to the following:

This shows that meter is dry now, and has been dry for more than 22 days in the last 3 0 days.

Yours sincerely,
Kamstrup South Africa (Pty) Ltd.

Marthinus Botha
Technical Manager, South Africa
Electricity

T: +27 87 357 8659
M: +27 82 826 1915
E: mjb@kamstrup.com

```
Interval Hours
0 0 hours
1 1-8 hours
2 9-24 hours = 1 day and night
3 25-72 hours = 2-3 days and nights
4 73-168 hours = 4-7 days and nights
5 169-336 hours = 8-14 days and nights
6 337-504 hours = 15-21 days and nights
7 > 505 hours = 22-31 days and nights
```
```
Burst Leak Reverse Dry Burst Leak Reverse Dry
3 3 3 3 1 1 1 1
000 000 000 111 0 0 0 1
```
```
0 hours 0 hours 0 hours
> 505 hours
= 22-31 days and
```
```
nights
```
## FALSE FALSE FALSE TRUE

## 0000000001110001


