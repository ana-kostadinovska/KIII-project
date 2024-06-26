# Апликација за менаџирање на студенти

Aпликација за менаџирање на студенти која овозможува прегледување, додавање, уредување и бришење на студенти.

## Стартување на апликацијата (Docker)

  Се извршуа командата `docker compose up`

## Стартување на апликацијата (Kubernetes)

  - Се креира cluster: `k3d cluster create students-cluster -p “9091:80@loadbalancer`
  - yaml датотеките се наоѓаат во `kubernetes` фолдерот: `cd kubernetes`
  - Се прави deploy на овие датотеки (по наведениот редослед):
    `kubectl apply -f namespace.yaml`
    `kubectl apply -f config-map1.yaml`
    `kubectl apply -f secret-app.yaml`
    `kubectl apply -f deployment.yaml`
    `kubectl apply -f service-app.yaml`
    `kubectl apply -f ingress.yaml`
    `kubectl apply -f config-map-db.yaml`
    `kubectl apply -f secret1.yaml`
    `kubectl apply -f statefulset-db.yaml`
    `kubectl apply -f service-db.yaml`
