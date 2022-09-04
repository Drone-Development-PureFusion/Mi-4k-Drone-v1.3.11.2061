.class public Lcom/google/android/gms/internal/ajy;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/ajy$e;,
        Lcom/google/android/gms/internal/ajy$f;,
        Lcom/google/android/gms/internal/ajy$c;,
        Lcom/google/android/gms/internal/ajy$d;,
        Lcom/google/android/gms/internal/ajy$b;,
        Lcom/google/android/gms/internal/ajy$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/google/android/gms/internal/ajy$a;

.field public static final b:Lcom/google/android/gms/internal/ajy$b;

.field public static final c:Lcom/google/android/gms/internal/ajy$d;

.field public static final d:Lcom/google/android/gms/internal/ajy$c;

.field public static final e:Lcom/google/android/gms/internal/ajy$f;

.field public static final f:Lcom/google/android/gms/internal/ajy$e;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const v3, 0x3e8fa0

    new-instance v0, Lcom/google/android/gms/internal/ajy$a;

    const-string v1, "created"

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/internal/ajy$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/ajy;->a:Lcom/google/android/gms/internal/ajy$a;

    new-instance v0, Lcom/google/android/gms/internal/ajy$b;

    const-string v1, "lastOpenedTime"

    const v2, 0x419ce0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ajy$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/ajy;->b:Lcom/google/android/gms/internal/ajy$b;

    new-instance v0, Lcom/google/android/gms/internal/ajy$d;

    const-string v1, "modified"

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/internal/ajy$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/ajy;->c:Lcom/google/android/gms/internal/ajy$d;

    new-instance v0, Lcom/google/android/gms/internal/ajy$c;

    const-string v1, "modifiedByMe"

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/internal/ajy$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/ajy;->d:Lcom/google/android/gms/internal/ajy$c;

    new-instance v0, Lcom/google/android/gms/internal/ajy$f;

    const-string v1, "sharedWithMe"

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/internal/ajy$f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/ajy;->e:Lcom/google/android/gms/internal/ajy$f;

    new-instance v0, Lcom/google/android/gms/internal/ajy$e;

    const-string v1, "recency"

    const v2, 0x7a1200

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ajy$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/ajy;->f:Lcom/google/android/gms/internal/ajy$e;

    return-void
.end method
