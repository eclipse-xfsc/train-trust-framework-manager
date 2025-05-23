# Train Trust Framework Manager

## Description
XFSC Train Trust Framework Manager allows Trust Framework and Trust List Provision. TFM is responsioble for configuring and managing trust frameworks with its corresponding trust lists. It allows creation of trust lists for corresponding trust framework names. TFM also helps to anchor DIDs and trust frameworks in DNS using DNS Zone Manager. TFM also has REST API endpoints which are responsible for onboarding entities into trust list.

This is a Reference Implementation of the [Gaia-X TRAIN Lot](https://eclipse.dev/xfsc/train/train/#trust-framework-and-trust-list-provision).


## TRAIN

TRAIN provides components for a flexible and cross-domain trust infrastructure to sovereignly manage trust anchors with DNS(SEC) and verify the inclusion of entities (e.g. issuers of self-sovereign identity credentials) in trust frameworks.

For more information please visit the website: https://www.hci.iao.fraunhofer.de/de/identity-management/identity-und-accessmanagement/TRAIN_EN.html



## Requirements

* Java 17 or newer
* Maven ~3.6.0
* Internet access 
* TRAIN Trust Infrastructure
* Zone Manager

## Documentation
### [Short Software Description](./README.md#description)
### [Usage Guide](./doc/README.md)
### [Guide to integrate with Notarization Service (NOT)](./doc/Integration_with_NotaryAPI/index.md)
### [Guide to integrate with OCM/PCM)](./doc/Integration_with_OCM_PCM/index.md)
### [Usage and integration guide for TSA](./doc/Integration_with_TSA/index.md)
### [REST API](./Swagger/openapi-tspa.json)
### [GDPR design decisions](https://gitlab.eclipse.org/eclipse/xfsc/train/TRAIN-Documentation/-/blob/main/concepts/gdpr/Readme.md)
### [Security concept](https://gitlab.eclipse.org/eclipse/xfsc/train/TRAIN-Documentation/-/tree/main/concepts/security)
### [Operations concept for Train Trust Framework Manager](./doc/operation)
### [Blueprint guides how to setup a federation in usage of all components (step by step)](https://gitlab.eclipse.org/eclipse/xfsc/train/TRAIN-Documentation/-/tree/main/demonstration?ref_type=heads)
### [FAQ](https://gitlab.eclipse.org/eclipse/xfsc/train/TRAIN-Documentation#frequently-asked-questions)
### [Keyword Directory](https://gitlab.eclipse.org/eclipse/xfsc/xfsc-spec-2/-/blob/main/docs/train/train.md?ref_type=heads#definitions-acronyms-and-abbreviations)


## Support
To get support you can open an issue in the project [Issues](https://github.com/eclipse-xfsc/train-trust-framework-manager/-/issues) section.


## Getting Started
To start with Train Trust Framework Manager project please follow the instructions: [Steps to build Train Trust Framework Manager](./deploy/local/README.md/#how-to-build-the-project-locally).

## Roadmap
The project v1.0.0 will be released in February 2024.

## Contributing
If you want to contribute to the project - please request a membership at [Project Members](https://github.com/eclipse-xfsc/train-trust-framework-manager/-/project_members) section.

## Authors and acknowledgment
The project is implemented by Fraunhofer IAO, project members are:
- [Isaac Henderson](https://gitlab.eclipse.org/isaachenderson)
- [Juan Vargas](https://gitlab.eclipse.org/juanvargas)
- [Michael Kubach](https://gitlab.eclipse.org/mkubach)
- [Sirish Kalubhai Savaliya](https://gitlab.eclipse.org/sirish1911)

# License
* Apache License 2.0 (see [LICENSE](./LICENSE))
