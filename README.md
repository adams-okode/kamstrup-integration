## Decrypting and decoding Sigfox meter data

This is an example for decrypting and decoding data from the Kamstrup MULTICAL 21 ultrasonic water
meter with radio module 11 , communicating via **Sigfox network**.
For reference, please see these documents:

- Datasheet: [http://products.kamstrup.com/download.php?uid=515d4ab](http://products.kamstrup.com/download.php?uid=515d4ab)
- Technical Description: [http://products.kamstrup.com/download.php?uid=515d4b410de](http://products.kamstrup.com/download.php?uid=515d4b410de)

The meter specific XML based key file and the Sigfox Data file can be downloaded from your MyKam-
strup account https://www.kamstrup.com/en-en/my-kamstrup-login, see
https://www.kamstrup.com/en-en/my-kamstrup-guides for help.



# Deploy

```bash
mvn clean install 
```
This installs the package to your local repository

```java
  String key = 'XXXXXXXXXXXXX' ;
  String meterRx = 'XXXXXXXXXXXXX';
  Kamstrup kamstrup = new Kamstrup(key, meterRx);
  kamstrup.packIDDRespones.toString();
  kamstrup.packageContent.toString();
  kamstrup.infoCodes.toString();
```
packIDDRespones
```json
  {
    "loggingFrequency": "Daily",
    "resultDecimalPlaces": 3,
    "unitStructure": "m3|L/hr",
    "packageType": 1
  }
```

packageContent
```json
  {
    "volume": 13.433,
    "infoCode": "3468",
    "minFlow": null,
    "maxFlow": 0.427,
    "minWaterTemperature": null,
    "minAmbientrTemperature": null,
    "maxAmbientTemperature": null
  }
```

infoCodes
```json
  {
    "burstDuration": "1 - 8  Hrs",
    "leakDuration": "169 - 336 Hrs",
    "reverseDuration": "0 Hrs",
    "dryDuration": "337 - 504 Hrs",
    "burst": true,
    "leak": false,
    "reverse": false,
    "dry": false
  }
```
-----------------

## How To run 

Incase you would like to use the compiled JAR

```bash

java -jar kamstrup-integration-1.0.jar {key} {data}

```
