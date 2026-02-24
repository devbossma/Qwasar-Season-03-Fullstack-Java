# Welcome to National Parks Uml
***

## Task
The goal of this project is to design a comprehensive UML Class Diagram for a **National Park Management System**. The challenge is to correctly model real-world entities — Parks, Users, Accommodations, and Passes — and define the precise relationships between them using proper OOP principles: **Association**, **Aggregation**, and **Composition**, while also applying correct **multiplicity**, **inheritance**, and **interface** contracts.

The difficulty lies in:
- Distinguishing between Composition (◆) and Aggregation (◇) based on lifecycle dependency
- Correctly separating `Ranger` and `Visitor` as distinct subclasses of `User`, since they have fundamentally different relationships to `Park`
- Applying the right multiplicity values on each end of every relationship arrow

---

## Description
The solution is a UML Class Diagram built using [draw.io](https://app.diagrams.net), structured around the following design decisions:

### Class Hierarchy

**User (abstract)**
The base class for all users in the system. Holds shared attributes (`id`, `name`, `email`, `password`) and shared methods (`login()`, `logout()`). Declares the abstract method `authorizeAccess(park: Park): bool` which all subclasses must implement.

- **Ranger** extends `User`: A ranger is tied to a specific park. They cannot exist meaningfully without one. Adds `badgeNumber`, `parkId`, and methods `patrolPark()` and `fileReport()`. Linked to `Park` via **Composition (◆)**.

- **Visitor** extends `User`: A visitor exists independently of any park. They can hold passes and purchase tickets. Linked to `Park` via **Association (→)** and to `Pass` via **Aggregation (◇)**.

**Accommodation (abstract)**
Represents any place to stay within a park. Implements the `Bookable` interface and declares the abstract method `checkAvailability(): bool`. Holds `id`, `name`, `location`, `capacity`, `pricePerNight`, and `parkId`. Provides concrete methods `book()` and `cancel()`.

- **Hotel** extends `Accommodation`: Adds `numberOfRooms` and `stars`.
- **Lodge** extends `Accommodation`: Adds `numberOfCabins`.

**Pass (abstract)**
Represents park entry passes. Holds `id`, `price`, and `visitorId`. Declares the abstract method `isValid(): bool`.

- **AnnualPass** extends `Pass` — Adds `startDate`, `expiryDate`, and a `renew()` method.
- **Ticket** extends `Pass` — Adds `date` and `parkId`.

**Park**
The central class of the system. Owns `Accommodations`, `Rangers`, and `Passes` (Composition). Manages `Visitors` through Association.

**«interface» Bookable**
Defines the contract: `book(): void`, `cancel(): void`, `checkAvailability(): bool`. Implemented by `Accommodation`'s Sub_Classes.

---

### Relationships Summary

| Relationship | Type | Multiplicity | Reason |
|---|---|---|---|
| `Park` → `Accommodation` | Composition ◆ | 1 to 1..* | Accommodation cannot exist without a Park |
| `Park` → `Ranger` | Composition ◆ | 1 to 1..* | Ranger role is meaningless without a Park |
| `Park` → `Pass` | Composition ◆ | 1 to 0..* | Passes are park-specific |
| `Park` → `Visitor` | Aggregation ◇ | 1 to 0..* | Visitors exist independently of Parks |
| `Visitor` → `Pass` | Aggregation ◇ | 1 to 0..* | A visitor can hold many passes; passes can outlive the visitor record |
| `Accommodation` → `Bookable` | Implementation | — | Accommodation fulfills the Bookable contract |
| `Ranger`, `Visitor` → `User` | Inheritance | — | Both are specializations of the abstract User |
| `Hotel`, `Lodge` → `Accommodation` | Inheritance | — | Both are concrete types of Accommodation |
| `AnnualPass`, `Ticket` → `Pass` | Inheritance | — | Both are concrete types of Pass |

---

### Key Design Decisions

**Why separate `Ranger` and `Visitor`?**
Initially modeled as a single `User` class with a `role` field, but this approach fails to capture the lifecycle difference: a `Ranger` is meaningless without a `Park` (Composition), while a `Visitor` survives independently (Aggregation/Association). Separating them produces an accurate and extensible model.

**Why is `Accommodation` abstract?**
Because no accommodation in the real world is just a generic "place to stay", it's always either a Hotel, Lodge, or another concrete type. The abstract class enforces `checkAvailability()` to be implemented by each subtype.

**Why use the `Bookable` interface?**
To enforce a contract independently of the class hierarchy. In the future, other entities (e.g., guided tours) could implement `Bookable` without inheriting from `Accommodation`.

---

## Installation
No installation is required. The diagram is created and opened using the free web-based tool [draw.io](https://app.diagrams.net).

To open the diagram:

1. Downlod the [Qwasar National Park UML.drawio](https://drive.google.com/file/d/1g4xPaq-iNWjGSbvijsPiLadvtGAyi2Wn/view?usp=sharing) file.
2. Navigate to [draw.io](https://app.diagrams.net)
3.
2.
3. Select the file: Qwasar_National_Park_UML.drawio


To export the diagram as an image or PDF:
```
File → Export As → PNG / PDF / SVG
```

---

## Usage
The `.drawio` file contains the full UML Class Diagram for the National Park system. It can be used to:

- Guide the implementation of the system in any OOP language (Java, Python, C++, etc.)
- Communicate the architecture to other developers or reviewers
- Serve as a reference for class attributes, methods, and relationships before writing any code

To read the diagram:
- **Diamond on the line (◆)** = Composition: the child class cannot exist without the parent
- **Open diamond (◇)** = Aggregation: the child can exist independently
- **Arrow (→)** = Association or navigation direction
- **Hollow triangle arrowhead** = Inheritance (Extends / Implements)
- **Numbers on arrows** = Multiplicity (e.g., `1` to `0..*` means "one park has zero or more passes")

---

### The Core Team



<span><i>Made at <a href='https://qwasar.io'>Qwasar SV -- Software Engineering School</a></i></span>
<span><img alt='Qwasar SV -- Software Engineering School's Logo' src='https://storage.googleapis.com/qwasar-public/qwasar-logo_50x50.png' width='20px' /></span>
