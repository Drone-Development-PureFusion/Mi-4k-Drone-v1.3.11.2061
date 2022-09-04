.class public final Lcom/google/android/gms/drive/b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/drive/b$b;,
        Lcom/google/android/gms/drive/b$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/google/android/gms/common/api/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$g",
            "<",
            "Lcom/google/android/gms/drive/internal/bt;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lcom/google/android/gms/common/api/Scope;

.field public static final c:Lcom/google/android/gms/common/api/Scope;

.field public static final d:Lcom/google/android/gms/common/api/Scope;

.field public static final e:Lcom/google/android/gms/common/api/Scope;

.field public static final f:Lcom/google/android/gms/common/api/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a",
            "<",
            "Lcom/google/android/gms/common/api/a$a$b;",
            ">;"
        }
    .end annotation
.end field

.field public static final g:Lcom/google/android/gms/common/api/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a",
            "<",
            "Lcom/google/android/gms/drive/b$b;",
            ">;"
        }
    .end annotation
.end field

.field public static final h:Lcom/google/android/gms/drive/c;

.field public static final i:Lcom/google/android/gms/drive/s;

.field public static final j:Lcom/google/android/gms/drive/u;

.field public static final k:Lcom/google/android/gms/drive/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/common/api/a$g;

    invoke-direct {v0}, Lcom/google/android/gms/common/api/a$g;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/b;->a:Lcom/google/android/gms/common/api/a$g;

    new-instance v0, Lcom/google/android/gms/common/api/Scope;

    const-string v1, "https://www.googleapis.com/auth/drive.file"

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/drive/b;->b:Lcom/google/android/gms/common/api/Scope;

    new-instance v0, Lcom/google/android/gms/common/api/Scope;

    const-string v1, "https://www.googleapis.com/auth/drive.appdata"

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/drive/b;->c:Lcom/google/android/gms/common/api/Scope;

    new-instance v0, Lcom/google/android/gms/common/api/Scope;

    const-string v1, "https://www.googleapis.com/auth/drive"

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/drive/b;->d:Lcom/google/android/gms/common/api/Scope;

    new-instance v0, Lcom/google/android/gms/common/api/Scope;

    const-string v1, "https://www.googleapis.com/auth/drive.apps"

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/drive/b;->e:Lcom/google/android/gms/common/api/Scope;

    new-instance v0, Lcom/google/android/gms/common/api/a;

    const-string v1, "Drive.API"

    new-instance v2, Lcom/google/android/gms/drive/b$1;

    invoke-direct {v2}, Lcom/google/android/gms/drive/b$1;-><init>()V

    sget-object v3, Lcom/google/android/gms/drive/b;->a:Lcom/google/android/gms/common/api/a$g;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/common/api/a;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/a$b;Lcom/google/android/gms/common/api/a$g;)V

    sput-object v0, Lcom/google/android/gms/drive/b;->f:Lcom/google/android/gms/common/api/a;

    new-instance v0, Lcom/google/android/gms/common/api/a;

    const-string v1, "Drive.INTERNAL_API"

    new-instance v2, Lcom/google/android/gms/drive/b$2;

    invoke-direct {v2}, Lcom/google/android/gms/drive/b$2;-><init>()V

    sget-object v3, Lcom/google/android/gms/drive/b;->a:Lcom/google/android/gms/common/api/a$g;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/common/api/a;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/a$b;Lcom/google/android/gms/common/api/a$g;)V

    sput-object v0, Lcom/google/android/gms/drive/b;->g:Lcom/google/android/gms/common/api/a;

    new-instance v0, Lcom/google/android/gms/drive/internal/br;

    invoke-direct {v0}, Lcom/google/android/gms/drive/internal/br;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/b;->h:Lcom/google/android/gms/drive/c;

    new-instance v0, Lcom/google/android/gms/drive/internal/bw;

    invoke-direct {v0}, Lcom/google/android/gms/drive/internal/bw;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/b;->i:Lcom/google/android/gms/drive/s;

    new-instance v0, Lcom/google/android/gms/drive/internal/d;

    invoke-direct {v0}, Lcom/google/android/gms/drive/internal/d;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/b;->j:Lcom/google/android/gms/drive/u;

    new-instance v0, Lcom/google/android/gms/drive/internal/b;

    invoke-direct {v0}, Lcom/google/android/gms/drive/internal/b;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/b;->k:Lcom/google/android/gms/drive/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
