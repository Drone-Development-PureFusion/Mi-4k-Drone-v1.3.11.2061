.class final Lcom/google/android/gms/internal/aqc$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/aqc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field public static final a:[Ljava/lang/String;


# instance fields
.field private final b:Ljava/lang/String;

.field private final c:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    sget-object v2, Lcom/google/android/gms/internal/fh;->r:Lcom/google/android/gms/internal/fh;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/fh;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/google/android/gms/internal/fh;->s:Lcom/google/android/gms/internal/fh;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/fh;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    sput-object v0, Lcom/google/android/gms/internal/aqc$a;->a:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/aqc$a;->b:Ljava/lang/String;

    sget-object v0, Lcom/google/android/gms/internal/aqc$a;->a:[Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/aqc$a;->c:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/aqc$a;->b:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/aqc$a;->c:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/aqc$a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b()[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/aqc$a;->c:[Ljava/lang/String;

    return-object v0
.end method
