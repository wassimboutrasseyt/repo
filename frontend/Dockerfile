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

# Start Vite dev server with config (includes proxy settings)
CMD ["npx", "vite"]
