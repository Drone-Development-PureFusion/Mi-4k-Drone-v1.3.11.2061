.class Lcom/google/android/gms/cast/internal/e$b$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/cast/internal/e$b;->a(Lcom/google/android/gms/cast/internal/DeviceStatus;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/cast/internal/e;

.field final synthetic b:Lcom/google/android/gms/cast/internal/DeviceStatus;

.field final synthetic c:Lcom/google/android/gms/cast/internal/e$b;


# direct methods
.method constructor <init>(Lcom/google/android/gms/cast/internal/e$b;Lcom/google/android/gms/cast/internal/e;Lcom/google/android/gms/cast/internal/DeviceStatus;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/internal/e$b$2;->c:Lcom/google/android/gms/cast/internal/e$b;

    iput-object p2, p0, Lcom/google/android/gms/cast/internal/e$b$2;->a:Lcom/google/android/gms/cast/internal/e;

    iput-object p3, p0, Lcom/google/android/gms/cast/internal/e$b$2;->b:Lcom/google/android/gms/cast/internal/DeviceStatus;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/internal/e$b$2;->a:Lcom/google/android/gms/cast/internal/e;

    iget-object v1, p0, Lcom/google/android/gms/cast/internal/e$b$2;->b:Lcom/google/android/gms/cast/internal/DeviceStatus;

    invoke-static {v0, v1}, Lcom/google/android/gms/cast/internal/e;->a(Lcom/google/android/gms/cast/internal/e;Lcom/google/android/gms/cast/internal/DeviceStatus;)V

    return-void
.end method
