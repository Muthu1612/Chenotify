# Chenotify
Smart City Incident Management Platform


# login
```
curl -X POST http://localhost:8080/api/auth/login \
  -H "Content-Type: application/json" \
  -d '{"username":"user", "password":"password"}'
```

# call  endpoint

```
curl -X POST http://localhost:8080/api/notes \
  -H "Authorization: Bearer TOKEN_HERE" \
  -H "Content-Type: application/json" \
  -d '{"title": "JWT Test", "content": "With Spring Security"}'

```