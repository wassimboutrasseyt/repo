FROM node:22-alpine

WORKDIR /app

# Copy package files
COPY package*.json ./

# Install dependencies
RUN npm ci

# Copy application files
COPY . .

# Expose the port
EXPOSE 5173

# Start Vite dev server bound to all interfaces (for container use)
CMD ["npx", "vite", "--host", "0.0.0.0"]
