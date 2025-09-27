# SpringAI Demo

A simple Spring Boot application that provides an AI-powered chat service.
The assistant, **LongAI**, is friendly, helpful, and smart, developed by Phạm Xuân Hoàng Long from Vietnam.

---

## 🚀 Features

- AI chat assistant using Spring AI
- RESTful API for chat requests

## 🛠️ Technologies

- Java
- Spring Boot
- Maven

---

## 🏁 Getting Started

### Prerequisites

- Java 17+
- Maven

### Installation

```bash
git clone https://github.com/hoanglong2534/springAIDemo.git
cd springAIDemo
mvn clean install
mvn spring-boot:run
```
The application will start on http://localhost:8080.
<hr></hr>

## 📦 Usage (Postman)
- Send a POST request to localhost:8080/api/v1/chat/ask with a JSON body:
```json
{
  "question": "hello LongAI, how are you?"
}
```
- You will receive a response from LongAI:
```RAW
Hello! I'm doing well, thank you for asking. How can I help you today?
```

## 🤝 Contributing
Contributions are welcome! Please open an issue or submit a pull request.
