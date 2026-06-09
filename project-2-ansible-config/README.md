# Project 2: Configuration Management Using Ansible

## Objective

Automate server configuration using Ansible playbooks.

---

## Problem Statement

Use Ansible to configure a remote Linux server by installing and managing software automatically — without logging into the server manually.

---

## Tools & Technologies

![Ansible](https://img.shields.io/badge/Ansible-EE0000?style=flat&logo=ansible&logoColor=white)
![Linux](https://img.shields.io/badge/Linux-FCC624?style=flat&logo=linux&logoColor=black)
![Nginx](https://img.shields.io/badge/Nginx-009639?style=flat&logo=nginx&logoColor=white)

---

## Project Structure

```
project-2-ansible-config/
├── inventory.ini       ← Target server list
├── playbook.yml        ← Ansible automation instructions
├── files/
│   └── index.html     ← Custom HTML file deployed to server
└── README.md
```

---

## Prerequisites

- Ansible installed on control node
- SSH access to target server (or localhost for practice)
- Target server running Ubuntu/Debian Linux

**Verify Ansible installation:**
```bash
ansible --version
```

---

## Steps Performed

### 1. Installed Ansible
```bash
sudo apt update
sudo apt install ansible -y
```

### 2. Set Up SSH Access
```bash
ssh-keygen -t rsa -b 4096
ssh-copy-id username@target-server-ip
```

### 3. Created Inventory File
Defined the target server in `inventory.ini` with connection details (IP, user, SSH key).

### 4. Tested Connection
```bash
ansible all -i inventory.ini -m ping
```
Result: `SUCCESS => { "ping": "pong" }`

### 5. Wrote Ansible Playbook
The playbook (`playbook.yml`) performs these tasks automatically:
- Updates the apt package cache
- Installs Nginx web server
- Starts and enables Nginx service
- Deploys a custom `index.html` to the web server
- Verifies Nginx is running

### 6. Ran the Playbook
```bash
ansible-playbook -i inventory.ini playbook.yml
```

### 7. Verified Configuration
```bash
ansible all -i inventory.ini -m command -a "systemctl status nginx"
```
Accessed `http://server-ip` in the browser to confirm deployment.

---

## Playbook Output

```
PLAY RECAP ************************************************************
target-server : ok=7  changed=4  unreachable=0  failed=0
```

---

## Key Concept Demonstrated: Idempotency

Running the playbook a second time without changes resulted in:
```
PLAY RECAP ************************************************************
target-server : ok=7  changed=0  unreachable=0  failed=0
```
Ansible detected everything was already configured and made no unnecessary changes.

---

## Outcome

Successfully automated the configuration of a Linux server using Ansible — installing Nginx, deploying a custom web page, and verifying the service state without any manual server login.

---

[← Back to Main Repository](../README.md)
