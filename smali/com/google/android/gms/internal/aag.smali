.class public final Lcom/google/android/gms/internal/aag;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/aaa;
.end annotation


# instance fields
.field a:Lcom/google/android/gms/internal/wx$c;

.field public final b:Lcom/google/android/gms/internal/vt;

.field public final c:Lcom/google/android/gms/internal/vt;

.field public final d:Lcom/google/android/gms/internal/vt;

.field private final e:Ljava/lang/Object;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Lcom/google/android/gms/internal/acl;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/acl",
            "<",
            "Lcom/google/android/gms/internal/aaj;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/aag;->e:Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/internal/acl;

    invoke-direct {v0}, Lcom/google/android/gms/internal/acl;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/aag;->h:Lcom/google/android/gms/internal/acl;

    new-instance v0, Lcom/google/android/gms/internal/aag$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/aag$1;-><init>(Lcom/google/android/gms/internal/aag;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/aag;->b:Lcom/google/android/gms/internal/vt;

    new-instance v0, Lcom/google/android/gms/internal/aag$2;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/aag$2;-><init>(Lcom/google/android/gms/internal/aag;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/aag;->c:Lcom/google/android/gms/internal/vt;

    new-instance v0, Lcom/google/android/gms/internal/aag$3;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/aag$3;-><init>(Lcom/google/android/gms/internal/aag;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/aag;->d:Lcom/google/android/gms/internal/vt;

    iput-object p2, p0, Lcom/google/android/gms/internal/aag;->g:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/internal/aag;->f:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/aag;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/aag;->e:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/aag;)Lcom/google/android/gms/internal/acl;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/aag;->h:Lcom/google/android/gms/internal/acl;

    return-object v0
.end method

.method static synthetic c(Lcom/google/android/gms/internal/aag;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/aag;->f:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lcom/google/android/gms/internal/aag;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/aag;->g:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public a()Lcom/google/android/gms/internal/wx$c;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/aag;->a:Lcom/google/android/gms/internal/wx$c;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/wx$c;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/aag;->a:Lcom/google/android/gms/internal/wx$c;

    return-void
.end method

.method public b()Ljava/util/concurrent/Future;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/Future",
            "<",
            "Lcom/google/android/gms/internal/aaj;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/aag;->h:Lcom/google/android/gms/internal/acl;

    return-object v0
.end method

.method public c()V
    .locals 0

    return-void
.end method
