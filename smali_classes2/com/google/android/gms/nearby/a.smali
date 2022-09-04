.class public final Lcom/google/android/gms/nearby/a;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lcom/google/android/gms/common/api/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a",
            "<",
            "Lcom/google/android/gms/common/api/a$a$b;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lcom/google/android/gms/nearby/connection/a;

.field public static final c:Lcom/google/android/gms/common/api/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a",
            "<",
            "Lcom/google/android/gms/common/api/a$a$b;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Lcom/google/android/gms/nearby/connection/dev/d;

.field public static final e:Lcom/google/android/gms/common/api/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a",
            "<",
            "Lcom/google/android/gms/nearby/messages/g;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Lcom/google/android/gms/nearby/messages/f;

.field public static final g:Lcom/google/android/gms/nearby/messages/q;

.field public static final h:Lcom/google/android/gms/common/api/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a",
            "<",
            "Lcom/google/android/gms/common/api/a$a$b;",
            ">;"
        }
    .end annotation
.end field

.field public static final i:Lcom/google/android/gms/nearby/bootstrap/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/common/api/a;

    const-string v1, "Nearby.CONNECTIONS_API"

    sget-object v2, Lcom/google/android/gms/internal/ang;->b:Lcom/google/android/gms/common/api/a$b;

    sget-object v3, Lcom/google/android/gms/internal/ang;->a:Lcom/google/android/gms/common/api/a$g;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/common/api/a;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/a$b;Lcom/google/android/gms/common/api/a$g;)V

    sput-object v0, Lcom/google/android/gms/nearby/a;->a:Lcom/google/android/gms/common/api/a;

    new-instance v0, Lcom/google/android/gms/internal/ang;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ang;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/a;->b:Lcom/google/android/gms/nearby/connection/a;

    new-instance v0, Lcom/google/android/gms/common/api/a;

    const-string v1, "Nearby.CONNECTIONS_DEV_API"

    sget-object v2, Lcom/google/android/gms/nearby/internal/connection/dev/l;->b:Lcom/google/android/gms/common/api/a$b;

    sget-object v3, Lcom/google/android/gms/nearby/internal/connection/dev/l;->a:Lcom/google/android/gms/common/api/a$g;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/common/api/a;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/a$b;Lcom/google/android/gms/common/api/a$g;)V

    sput-object v0, Lcom/google/android/gms/nearby/a;->c:Lcom/google/android/gms/common/api/a;

    new-instance v0, Lcom/google/android/gms/nearby/internal/connection/dev/l;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/internal/connection/dev/l;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/a;->d:Lcom/google/android/gms/nearby/connection/dev/d;

    new-instance v0, Lcom/google/android/gms/common/api/a;

    const-string v1, "Nearby.MESSAGES_API"

    sget-object v2, Lcom/google/android/gms/nearby/messages/internal/t;->b:Lcom/google/android/gms/common/api/a$b;

    sget-object v3, Lcom/google/android/gms/nearby/messages/internal/t;->a:Lcom/google/android/gms/common/api/a$g;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/common/api/a;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/a$b;Lcom/google/android/gms/common/api/a$g;)V

    sput-object v0, Lcom/google/android/gms/nearby/a;->e:Lcom/google/android/gms/common/api/a;

    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/t;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/messages/internal/t;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/a;->f:Lcom/google/android/gms/nearby/messages/f;

    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/u;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/messages/internal/u;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/a;->g:Lcom/google/android/gms/nearby/messages/q;

    new-instance v0, Lcom/google/android/gms/common/api/a;

    const-string v1, "Nearby.BOOTSTRAP_API"

    sget-object v2, Lcom/google/android/gms/internal/amy;->b:Lcom/google/android/gms/common/api/a$b;

    sget-object v3, Lcom/google/android/gms/internal/amy;->a:Lcom/google/android/gms/common/api/a$g;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/common/api/a;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/a$b;Lcom/google/android/gms/common/api/a$g;)V

    sput-object v0, Lcom/google/android/gms/nearby/a;->h:Lcom/google/android/gms/common/api/a;

    new-instance v0, Lcom/google/android/gms/internal/amy;

    invoke-direct {v0}, Lcom/google/android/gms/internal/amy;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/a;->i:Lcom/google/android/gms/nearby/bootstrap/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
