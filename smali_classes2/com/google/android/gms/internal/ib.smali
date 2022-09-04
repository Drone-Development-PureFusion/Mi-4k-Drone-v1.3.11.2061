.class public Lcom/google/android/gms/internal/ib;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lcom/google/android/gms/internal/kv;

.field public static final b:Lcom/google/android/gms/internal/kv;

.field public static final c:Lcom/google/android/gms/internal/kv;

.field public static final d:Lcom/google/android/gms/internal/kv;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, ".info"

    invoke-static {v0}, Lcom/google/android/gms/internal/kv;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/kv;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ib;->a:Lcom/google/android/gms/internal/kv;

    const-string v0, "serverTimeOffset"

    invoke-static {v0}, Lcom/google/android/gms/internal/kv;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/kv;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ib;->b:Lcom/google/android/gms/internal/kv;

    const-string v0, "authenticated"

    invoke-static {v0}, Lcom/google/android/gms/internal/kv;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/kv;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ib;->c:Lcom/google/android/gms/internal/kv;

    const-string v0, "connected"

    invoke-static {v0}, Lcom/google/android/gms/internal/kv;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/kv;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ib;->d:Lcom/google/android/gms/internal/kv;

    return-void
.end method
