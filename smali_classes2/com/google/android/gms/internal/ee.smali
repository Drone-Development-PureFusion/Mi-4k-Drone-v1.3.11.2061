.class public final Lcom/google/android/gms/internal/ee;
.super Lcom/google/android/gms/internal/ea;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ea",
        "<",
        "Lcom/google/android/gms/internal/ea",
        "<*>;>;"
    }
.end annotation


# static fields
.field public static final b:Lcom/google/android/gms/internal/ee;

.field public static final c:Lcom/google/android/gms/internal/ee;

.field public static final d:Lcom/google/android/gms/internal/ee;

.field public static final e:Lcom/google/android/gms/internal/ee;


# instance fields
.field private final f:Ljava/lang/String;

.field private final g:Z

.field private final h:Lcom/google/android/gms/internal/ea;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ea",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ee;

    const-string v1, "BREAK"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ee;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/ee;->b:Lcom/google/android/gms/internal/ee;

    new-instance v0, Lcom/google/android/gms/internal/ee;

    const-string v1, "CONTINUE"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ee;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/ee;->c:Lcom/google/android/gms/internal/ee;

    new-instance v0, Lcom/google/android/gms/internal/ee;

    const-string v1, "NULL"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ee;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/ee;->d:Lcom/google/android/gms/internal/ee;

    new-instance v0, Lcom/google/android/gms/internal/ee;

    const-string v1, "UNDEFINED"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ee;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/ee;->e:Lcom/google/android/gms/internal/ee;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ea;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ea",
            "<*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/ea;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "RETURN"

    iput-object v0, p0, Lcom/google/android/gms/internal/ee;->f:Ljava/lang/String;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ee;->g:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/ee;->h:Lcom/google/android/gms/internal/ea;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ea;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ee;->f:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ee;->g:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ee;->h:Lcom/google/android/gms/internal/ea;

    return-void
.end method


# virtual methods
.method public synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ee;->d()Lcom/google/android/gms/internal/ea;

    move-result-object v0

    return-object v0
.end method

.method public d()Lcom/google/android/gms/internal/ea;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ee;->h:Lcom/google/android/gms/internal/ea;

    return-object v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ee;->g:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ee;->f:Ljava/lang/String;

    return-object v0
.end method
