# homework-Iron-Battle-Group4
This is a detailed `README.md` for your basic RPG battle simulator project:

---

# RPG Battle Simulator

Welcome to the RPG Battle Simulator, a text-based dueling game where warriors and wizards face off to determine the ultimate champion.

## Overview

This simulator lets players create warriors and wizards, each with their unique stats and combat styles, and pit them against each other in an epic 1v1 battle.

## Table of Contents

- [Classes & Interface](#classes--interface)
  - [Character Class](#character-class)
  - [Warrior Class](#warrior-class)
  - [Wizard Class](#wizard-class)
  - [Attacker Interface](#attacker-interface)
- [Battle Mechanics](#battle-mechanics)
- [Requirements](#requirements)
- [Bonus Features](#bonus-features)

## Classes & Interface

### Character Class

- **Attributes**:
  - `id`: An auto-generated unique identifier.
  - `name`: Character's name.
  - `hp`: Health points. Varies between warriors and wizards.
  - `isAlive`: A status flag indicating if the character is still alive.

### Warrior Class

Derived from `Character`.

- **Attributes**:
  - `stamina`: Represents the stamina resource consumed for attacks.
  - `strength`: Measures the warrior's attack strength.
- **Attacks**:
  - `Heavy Attack`: Consumes 5 stamina points.
  - `Weak Attack`: Recovers 1 stamina point.

### Wizard Class

Derived from `Character`.

- **Attributes**:
  - `mana`: Represents the mana resource consumed for spells.
  - `intelligence`: Measures the wizard's spell power.
- **Attacks**:
  - `Fireball`: Consumes 5 mana points.
  - `Staff Hit`: Recovers 1 mana point.

# Attacker Interface

Both the Warrior and Wizard classes implement this interface.

- **Methods**:
  - `attack()`: The method through which a character attacks its opponent.

# Battle Mechanics

The battle is a 1v1 duel that proceeds in rounds. In each round:

- Both characters attack simultaneously.
- Even if a character is defeated, both still receive damage.
- In the event of a tie, the battle restarts.

# Requirements

1. Use a text-based menu via standard I/O.
2. Craft unique warriors and wizards.
3. Engage in duels and identify victors.
4. Monitor a comprehensive duel action log.

# Bonus Features

- Load characters from a CSV.
- Simulate battles with random attributes.
---
