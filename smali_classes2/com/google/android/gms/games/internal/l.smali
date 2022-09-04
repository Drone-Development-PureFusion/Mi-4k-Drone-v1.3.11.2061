.class public final Lcom/google/android/gms/games/internal/l;
.super Ljava/lang/Object;


# static fields
.field private static final a:Lcom/google/android/gms/common/internal/ab;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/common/internal/ab;

    const-string v1, "GamesJingle"

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/internal/ab;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/games/internal/l;->a:Lcom/google/android/gms/common/internal/ab;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
