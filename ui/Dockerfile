# Stage 1: Build Stage
FROM node:lts-alpine AS builder

WORKDIR /app

# Nur package-Dateien für Cache
COPY package*.json ./

# Installiere alle Dependencies (inkl. devDependencies)
RUN npm install

# Restliche Projektdateien kopieren
COPY . .

# Baue das Projekt (z. B. TypeScript, Webpack, etc.)
RUN npm run build

# Stage 2: Production Runtime
FROM node:lts-alpine AS runtime

ENV NODE_ENV=production
WORKDIR /app

# Nur package-Dateien kopieren und installiere production deps
COPY package*.json ./
RUN npm install --production

# Nur das Gebaute und nötige Code übernehmen
COPY --from=builder /app/dist ./dist
COPY --from=builder /app/src ./src

# Optional: Wenn Konfigs, views oder public-Dateien nötig sind, hier kopieren

EXPOSE 80

# Starte den Server
CMD ["node", "src/server/main.js"]
